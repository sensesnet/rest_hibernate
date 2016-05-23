package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class BaseDao<T> implements Dao<T> {

    private static Logger log = Logger.getLogger(BaseDao.class);
    protected static HibernateUtil hibernateUtil = HibernateUtil.getHibernateUtil();
    private static Session session = null;

    public void add(T t) throws SQLException, DaoException {
        try {
            session = hibernateUtil.getSession();
            session.save(t);
        } catch (HibernateException e) {
            log.error("Save object error" + t, e);
            throw new DaoException("Save object error",e);
        }
    }

    public void remove(T t) throws SQLException, DaoException {
        try {
            session = hibernateUtil.getSession();
            session.delete(t);
        } catch (HibernateException e) {
            log.error(" - Error remove object", e);
            throw new DaoException("Error remove object", e);
        }
    }

    public T getById(Serializable id) throws SQLException, DaoException {
        T t = null;
        try {
            session = hibernateUtil.getSession();
            t = (T) session.load(getPersistentClass(), id);
        } catch (HibernateException e) {
            log.error(" - Error get by id object", e);
            throw new DaoException(e);
        }
        return t;
    }

    public List<T> getAll() throws SQLException, DaoException {

        List<T> list = null;
        String hql = "FROM " + getPersistentClass().getSimpleName();
        try {
            session = hibernateUtil.getSession();
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException e) {
            log.error("- Error get all", e);
            throw new DaoException(e);
        }
        return list;
    }


    public void edit(T t) throws SQLException, DaoException {
        try {
            session = hibernateUtil.getSession();
            session.saveOrUpdate(t);
            log.info("Object was updated" + t);
        } catch (HibernateException e) {
            log.error("Error edit/update object" + t, e);
            throw new DaoException(e);
        }
    }


    private Class getPersistentClass() {    // return load class
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
