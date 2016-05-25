package by.restaurantHibernate.Services;

import by.restaurantHibernate.Dao.Factory;
import by.restaurantHibernate.Dao.MealDao;
import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.iService.iMealService;
import org.hibernate.Transaction;
import by.restaurantHibernate.pojos.Meal;
import by.restaurantHibernate.util.HibernateUtil;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class MealService implements iMealService {

    Factory factory = Factory.getInstanse();
    MealDao mealDao = factory.getMealDao();
    private static Logger logger = Logger.getLogger(String.valueOf(MealService.class));

    @Override
    public List getAll() throws SQLException {
        Transaction transaction = null;
        List meals = new ArrayList();
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            meals =  mealDao.getAll();
            logger.info(" - Object meals get all: ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object meals wasn't get all: ", e);
            transaction.rollback();
            new DaoException(e);
        }
         return meals;
    }

    @Override
    public void add(Meal meal) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            mealDao.add(meal);
            logger.info(" - Object meal was add: " + meal);
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object meal wasn't add: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void edit(Meal meal) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            mealDao.edit(meal);
            logger.info(" - Object meal was edit: " + meal);
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object meal wasn't edit: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public void remove(Meal meal) throws SQLException {
        Transaction transaction = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            mealDao.remove(meal);
            logger.info(" - Object meal was edit: " + meal);
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object meal wasn't remove: ", e);
            transaction.rollback();
            new DaoException(e);
        }
    }

    @Override
    public Meal getById(int id) throws SQLException, DaoException {
        Transaction transaction = null;
        Meal meal = null;
        try {
            transaction = HibernateUtil.getHibernateUtil().getSession().beginTransaction();
            meal = (Meal) mealDao.getById(id);
            logger.info(" - Object meal was get by id ");
            transaction.commit();
        } catch (Exception e) {
            logger.error(" - Object meal wasn't get by id: ", e);
            transaction.rollback();
            new DaoException(e);
        }
        return meal;
    }

    public int getTotalPrice(List orderBean) {return 100;}
    public int getTotalTime(List orderBean) {
        return 200;
    }
}
