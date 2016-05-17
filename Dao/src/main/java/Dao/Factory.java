package Dao;

import pojos.OrderStatus;

/**
 * Created by KIRILL on 09.05.2016.
 */
public class Factory {
    private static Factory instanse = new Factory();

    public UserDao userDao;
    public MealDao mealDao;
    public OrderDao orderDao;
    public OrderStatusDao orderStatusDao;
    public UserDetailDao userDetailDao;


    private Factory() {
    }

    public static Factory getInstanse() {
        return Factory.instanse;
    }

    public UserDao getUserDao() {
        if (userDao == null)
            userDao = new UserDao();
            return userDao;

    }
    public MealDao getMealDao() {
        if (mealDao == null)
            mealDao = new MealDao();
        return mealDao;

    }
    public OrderDao getOrderDao() {
        if (orderDao == null)
            orderDao = new OrderDao();
        return orderDao;

    }
    public OrderStatusDao getOrderStatusDao() {
        if (orderStatusDao == null)
            orderStatusDao = new OrderStatusDao();
        return orderStatusDao;

    }
    public UserDetailDao getUserDetailDao() {
        if (userDetailDao == null)
            userDetailDao = new UserDetailDao();
        return userDetailDao;

    }

}
