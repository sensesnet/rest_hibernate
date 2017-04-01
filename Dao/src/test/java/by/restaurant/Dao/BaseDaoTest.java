package by.restaurant.Dao;


import by.restaurantHibernate.Dao.*;
import by.restaurantHibernate.pojos.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import by.restaurantHibernate.util.HibernateUtil;


public class BaseDaoTest {
    private static Logger logger = Logger.getLogger(BaseDaoTest.class);
    private static HibernateUtil hibernateUtil = HibernateUtil.getHibernateUtil();

    @Test
    public void testAdd() throws Exception {


        System.out.println("Start junit test");
        // get T DAO objects
        Factory factory = Factory.getInstanse();
//
        UserDao userDao = factory.getUserDao();
        OrderDao orderDao = factory.getOrderDao();
        MealDao mealDao = factory.getMealDao();
        UserDetailDao userDetailDao = factory.getUserDetailDao();
        OrderStatusDao orderStatusDao = factory.getOrderStatusDao();
//
//
//        System.out.println("Hibernate many to many (Annotation)");
//
//        // open session and start transaction
//
//        HibernateUtil hibernateUtil = HibernateUtil.getHibernateUtil();
//        Session session = hibernateUtil.getSession();
//
//        session.beginTransaction();
//
//
        User user = new User();
//        user.setFirstName("Krill");
//        user.setSecongName("Degt");
//        user.setLogin("Login");
//        user.setPassword("cosmos");
//        user.setEmail("cosmos@cosmos.ru");
//        user.setStatus("admin");
//        userDao.add(user);
//        System.out.println("! -------------user was create");
//
//
//        Meal meal = new Meal();
//        meal.setMealName("meal_1");
//        meal.setMealPrice(20000);
//        meal.setMealTime(200);
//        meal.setMealConsist("Test hibernate mapping");
//        mealDao.add(meal);
//        System.out.println("! -------------meal was create");
//
//
//        OrderStatus orderStatus = new OrderStatus();
//        orderStatus.setOrderId(1000);
//        orderStatus.setTotalPrice(100);
//        orderStatus.setTotalTime(100);
//        orderStatus.setOrderStatus("to admin");
//        orderStatusDao.add(orderStatus);
//        System.out.println("! -------------orderstatus was create");
//
//
//        UserDetail userDetail = new UserDetail();
//        userDetail.setCity("NY");
//        userDetail.setCountry("USA");
//        userDetail.setFlat(13);
//        userDetail.setStreet("Nilson str.");
//        userDetailDao.add(userDetail);
//        System.out.println("!   ------------userdetail was create");
//
//
//        Order order = new Order();
//        order.setOrderId(2);
//        order.setMealId(1);
//        order.setUserId(1);
//        orderDao.add(order);
//        System.out.println("! --------------order was create");
//
//
//        session.save(user);
//        session.save(meal);
//        session.save(userDetail);
//        session.save(order);
//        session.save(orderStatus);
//        session.getTransaction().commit();
//
//
//        hibernateUtil.closeSession(session);
//        logger.info("sesstion st " + session.isOpen());
//
//        int userId = user.getId();
//        Session session1 = HibernateUtil.getHibernateUtil().getSession();
//        session1.beginTransaction();
//        User user1 = (User) session1.get(User.class, userId);
//        session1.getTransaction().commit();
//
//        logger.info(user1.toString());
//
//
//        userDao.remove(user);
//        userDao.remove(user1);
//        mealDao.remove(meal);
//        orderDao.remove(order);
//        orderStatusDao.remove(orderStatus);
//        session.getTransaction().commit();
//
//        System.out.println("Done");
//
   }
}