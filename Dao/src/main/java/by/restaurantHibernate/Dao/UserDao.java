package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class UserDao extends BaseDao<User> {

    @Override
    public void add(User user) throws SQLException, DaoException {
        super.add(user);
    }

    @Override
    public void remove(User user) throws SQLException, DaoException {
        super.remove(user);
    }

    @Override
    public User getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(User user) throws SQLException, DaoException {
        super.edit(user);
    }


    /**
     * method  to get USER by his login
     *
     * @param login
     * @return
     */
    public User getByLogin(String login) {
        Session session = hibernateUtil.getSession();
        Query query = session.createQuery("from User where login='" + login + "'");
        User user = (User) query.uniqueResult();

        return user;


    }

    public List pagination(int first, int last) throws DaoException {
        List<User> list = null;
        try {
            Session session = hibernateUtil.getSession();
            Query query = session.createQuery("from User");
            query.setFirstResult(first);
            query.setMaxResults(last);
            list = query.list();
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return list;
    }
}
