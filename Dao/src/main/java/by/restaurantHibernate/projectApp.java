package by.restaurantHibernate;

import by.restaurantHibernate.Dao.Factory;
import by.restaurantHibernate.Dao.OrderDao;
import by.restaurantHibernate.Dao.UserDao;
import by.restaurantHibernate.DaoExceptions.DaoException;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 24.05.2016.
 */
public class projectApp {
    public static void main(String[] args) throws SQLException {
        System.out.println("Start junit test");
        Factory factory = Factory.getInstanse();
        OrderDao orderDao = factory.getOrderDao();
        List orderList = orderDao.getByIdList(1613448932);
        for(int i = 0; i<orderList.size();i++) {
            System.out.println(orderList.get(i));
        }
    }
}
