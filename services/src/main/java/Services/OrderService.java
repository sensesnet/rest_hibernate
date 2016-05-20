package Services;

import Dao.Factory;
import Dao.OrderDao;
import iService.iOrderService;
import pojos.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class OrderService implements iOrderService {

    Factory factory = Factory.getInstanse();
    OrderDao orderDao = factory.getOrderDao();

    @Override
    public List getAll() throws SQLException {
        return orderDao.getAll();
    }

    @Override
    public void add(Order order) throws SQLException {
        orderDao.add(order);

    }

    @Override
    public void edit(Order order) throws SQLException {
        orderDao.edit(order);

    }

    @Override
    public void remove(Order order) throws SQLException {
        orderDao.remove(order);

    }

    @Override
    public Order getById(int id) throws SQLException {
        return (Order) orderDao.getById(id);
    }

    public List getByIdList(int id) throws SQLException {
        return orderDao.getByIdList(id);
    }

}
