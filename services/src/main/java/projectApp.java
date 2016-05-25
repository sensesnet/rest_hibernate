import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.Services.MealService;
import by.restaurantHibernate.Services.UserService;
import by.restaurantHibernate.pojos.Meal;
import by.restaurantHibernate.pojos.User;

import java.sql.SQLException;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class projectApp {

    public static void main(String[] args) throws SQLException, SQLException, DaoException {
        MealService mealService = new MealService();
//        User user = new User();
//        user.setFirstName("Artem");
//        user.setSecongName("Degt");
//        user.setLogin("testService");
//        user.setPassword("testService");
//        user.setEmail("test@service.com");
//        userService.add(user);
        Meal meal = mealService.getById(25);
        System.out.println("take meal  by id" + meal);


    }
}
