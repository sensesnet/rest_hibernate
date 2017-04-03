package by.restaurantHibernate.Services;

import by.restaurantHibernate.Dao.Factory;
import by.restaurantHibernate.Dao.OrderStatusDao;
import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.iService.iOrderStatusService;
import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import by.restaurantHibernate.pojos.OrderStatus;
import by.restaurantHibernate.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIRILL on 17.05.2016.
 */
public class OrderStatusService implements iOrderStatusService {

    Factory factory = Factory.getInstanse();
    OrderStatusDao orderStatusDao = factory.getOrderStatusDao();
    private static Logger logger = Logger.getLogger(OrderStatusService.class);


    @Override
    public List getAll() throws SQLException {
        Transaction transaction = null;
        List orderStatus = new ArrayList();
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderStatus = orderStatusDao.getAll();
            logger.info(" - Object orderStatus get all: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orderStatus wasn't get all: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return orderStatus;
    }

    @Override
    public void add(OrderStatus orderStatus) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderStatusDao.add(orderStatus);
            logger.info(" - Object orderStatus was add: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orderStatus wasn't add: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void edit(OrderStatus orderStatus) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderStatusDao.edit(orderStatus);
            logger.info(" - Object orderStatus was edit: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orderStatus wasn't edit: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void remove(OrderStatus orderStatus) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderStatusDao.remove(orderStatus);
            logger.info(" - Object orderStatus was remove ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orderStatus wasn't remove: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public OrderStatus getById(int id) throws SQLException {
        Transaction transaction = null;
        OrderStatus orderStatus = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderStatus = (OrderStatus) orderStatusDao.getById(id);
            logger.info(" - Object orderStatus was get by id ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orderStatus wasn't get by id: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return orderStatus;
    }
}
