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
public class OrderDao extends BaseDao<Order> {
    @Override
    public void add(Order order) throws SQLException, DaoException {
        super.add(order);
    }

    @Override
    public void remove(Order order) throws SQLException, DaoException {
        super.remove(order);
    }

    @Override
    public Order getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(Order order) throws SQLException, DaoException {
        super.edit(order);
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