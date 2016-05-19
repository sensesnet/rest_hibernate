import Dao.*;
import org.hibernate.Session;
import pojos.*;
import util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by KIRILL on 09.05.2016.
 */
public class Project_App {

//    public static void main(String[] args) throws SQLException {
//        Factory factory = Factory.getInstanse();
////        UserDao userDao = factory.getUserDao();
////        OrderDao orderDao = factory.getOrderDao();
//        MealDao mealDao = factory.getMealDao();
////        UserDetailDao userDetailDao = factory.getUserDetailDao();
////        OrderStatusDao orderStatusDao = factory.getOrderStatusDao();
//        System.out.println("Hibernate many to many (Annotation)");
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//
//        User user = new User();
//        user.setFirstName("Krill");
//        user.setSecongName("Degt");
//        user.setLogin("Login");
//        user.setPassword("cosmos");
//        user.setEmail("cosmos@cosmos.ru");
//        user.setStatus("admin");
////        userDao.add(user);
//        System.out.println("! -------------user was create");
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
////        orderStatusDao.add(orderStatus);
//        System.out.println("! -------------orderstatus was create");
//
//
//        UserDetail userDetail = new UserDetail();
//        userDetail.setCity("NY");
//        userDetail.setCountry("USA");
//        userDetail.setFlat(13);
//        userDetail.setStreet("Nilson str.");
////        userDetailDao.add(userDetail);
//        System.out.println("!   ------------userdetail was create");
//
//
//        Order order = new Order();
//        order.setOrderId(2);
//        order.setMealId(1);
//        order.setUserId(1);
////        orderDao.add(order);
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
//        System.out.println("Done");
////        List<User> users = userDao.getAll();
////        System.out.print("User DB have fields:");
////
////        for (User userlist : users) {
////            System.out.print(userlist.getId() + " "
////                    + userlist.getFirstName()+ " "
////                    +userlist.getSecongName()+ " "
////                    + userlist.getLogin()+ " "
////                    +userlist.getPassword()+ " "
////                    +userlist.getEmail() + " "
////                    +userlist.getStatus());
////        }
//
//    }
}
