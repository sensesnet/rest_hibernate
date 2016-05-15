import Dao.Factory;
import Dao.MealDao;
import Dao.OrderDao;
import Dao.UserDao;
import pojos.Meal;
import pojos.Order;
import pojos.User;

import java.sql.SQLException;

/**
 * Created by KIRILL on 09.05.2016.
 */
public class Project_App {

    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstanse();
        UserDao userDao = factory.getUserDao();
        OrderDao orderDao = factory.getOrderDao();
        MealDao mealDao = factory.getMealDao();


        User user = new User();
        user.setFirstName("Krill");
        user.setSecongName("Degt");
        user.setLogin("Login");
        user.setPassword("cosmos");
        user.setEmail("cosmos@cosmos.ru");
        user.setStatus("admin");
        userDao.add(user);


        Meal meal = new Meal();
        meal.setMealName("meal_1");
        meal.setMealPrice(200);
        meal.setMealTime(200);
        meal.setMealConsist("Test hibernate mapping");
        mealDao.add(meal);


        Order order = new Order();
        order.setOrderId(1);
        order.setMealId(1);
        order.setUserId(1);
        orderDao.add(order);
//
//        List<User> users = userDao.getAll();
//        System.out.print("User DB have fields:");
////
//        for (User userlist : users) {
//            userlist.getId();
//            userlist.getFirstName();
//            userlist.getSecongName();
//            userlist.getLogin();
//            userlist.getPassword();
//            userlist.getEmail();
//            userlist.getStatus();
//            System.out.print(userlist.getId() + " "
//                    + userlist.getFirstName()+ " "
//                    +userlist.getSecongName()+ " "
//                    + userlist.getLogin()+ " "
//                    +userlist.getPassword()+ " "
//                    +userlist.getEmail() + " "
//                    +userlist.getStatus());
//        }

    }
}
