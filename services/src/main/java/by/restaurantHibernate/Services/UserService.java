package by.restaurantHibernate.Services;

import by.restaurantHibernate.Dao.Factory;
import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.iService.iUserService;
import by.restaurantHibernate.Dao.UserDao;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Transaction;
import by.restaurantHibernate.pojos.User;
import by.restaurantHibernate.util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class UserService implements iUserService {

    Factory factory = Factory.getInstanse();
    UserDao userDao = factory.getUserDao();
    private static Logger logger = Logger.getLogger(UserService.class);

    @Override
    public List getAll() throws SQLException {
        Transaction transaction = null;
        List users = new ArrayList();
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            users = userDao.getAll();
            logger.info(" - Object users get all: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object users wasn't get all: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return users;
    }

    @Override
    public void add(User user) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            userDao.add(user);
            logger.info(" - Object user was add: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object user wasn't add: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void edit(User user) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            userDao.edit(user);
            logger.info(" - Object user was edit: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object user wasn't edit: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void remove(User user) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            userDao.remove(user);
            logger.info(" - Object user was remove ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object user wasn't remove: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public User getById(int id) throws SQLException {
        Transaction transaction = null;
        User user = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            user = (User) userDao.getById(id);
            logger.info(" - Object user was get by id ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object user wasn't get by id: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return user;
    }

    public User getByLogin(String login) {
        Transaction transaction = null;
        User user = null;

        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            user = userDao.getByLogin(login);
            logger.info(" - Object user was get by login ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object user wasn't get by login: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return user;
    }

    public boolean authenticateUser(String login, String password) {
        User user = getByLogin(login);
        if (user != null && user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
