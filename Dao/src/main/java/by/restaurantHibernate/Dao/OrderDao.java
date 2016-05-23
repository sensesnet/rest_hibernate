package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.Order;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class OrderDao extends BaseDao {
    @Override
    public void add(Object o) throws SQLException, DaoException {
        super.add(o);
    }

    @Override
    public void remove(Object o) throws SQLException, DaoException {
        super.remove(o);
    }

    @Override
    public Object getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(Object o) throws SQLException, DaoException {
        super.edit(o);
    }

    public List getByIdList(int id) throws SQLException {
        List result = null;
        Session session = null;

        try {
            session = hibernateUtil.getSession();
            Criteria criteria = session.createCriteria(Order.class);
            criteria.add(Restrictions.eq("orderId", id));
            result = criteria.list();  // return object

        } catch (Exception e) {
            e.printStackTrace();
        }

        hibernateUtil.closeSession(session);
        return result;
    }

}