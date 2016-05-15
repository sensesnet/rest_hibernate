package Dao;

/**
 * Created by KIRILL on 09.05.2016.
 */
public class Factory {
    private static Factory instanse = new Factory();

    public UserDao userDao;
    public MealDao mealDao;
    public OrderDao orderDao;

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

}
