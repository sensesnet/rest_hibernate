package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.OrderStatus;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class OrderStatusDao extends BaseDao<OrderStatus> {
    @Override
    public void add(OrderStatus o) throws SQLException, DaoException {
        super.add(o);
    }

    @Override
    public void remove(OrderStatus o) throws SQLException, DaoException {
        super.remove(o);
    }

    @Override
    public OrderStatus getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(OrderStatus o) throws SQLException, DaoException {
        super.edit(o);
    }
}
