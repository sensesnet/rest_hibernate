package Services;

import Dao.Factory;
import Dao.OrderDao;
import DaoExceptions.DaoException;
import iService.iOrderService;
import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import pojos.Order;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class OrderService implements iOrderService {

    Factory factory = Factory.getInstanse();
    OrderDao orderDao = factory.getOrderDao();
    private static Logger logger = Logger.getLogger(OrderService.class);

    @Override
    public List getAll() throws SQLException {
        Transaction transaction = null;
        List orders = new ArrayList();
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orders = orderDao.getAll();
            logger.info(" - Object orders get all: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orders wasn't get all: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return orders;
    }

    @Override
    public void add(Order order) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderDao.add(order);
            logger.info(" - Object order was add: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orders wasn't add: ", e);
            transaction.rollback();
            new DaoException(e);
        }

    }

    @Override
    public void edit(Order order) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderDao.edit(order);
            logger.info(" - Object order was edit: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orders wasn't edit: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void remove(Order order) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            orderDao.remove(order);
            logger.info(" - Object order was remove ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orders wasn't remove: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public Order getById(int id) throws SQLException {
        Transaction transaction = null;
        Order order = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            order = (Order) orderDao.getById(id);
            logger.info(" - Object order was get by id ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object orders wasn't get by id: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return order;

    }

    public List getByIdList(int id) throws SQLException {
        Transaction transaction = null;
        List ordersById = new ArrayList();
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            ordersById =  orderDao.getByIdList(id);
            logger.info(" - Object order was get by id in LIST ");
            transaction.commit();
        }
        catch(Exception e){
            logger.error(" - Object orders wasn't get by id: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return ordersById;

        }

    }
