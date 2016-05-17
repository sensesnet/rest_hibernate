import Services.UserService;
import pojos.User;

import java.sql.SQLException;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class projectApp {

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User();
        user.setFirstName("Artem");
        user.setSecongName("Degt");
        user.setLogin("testService");
        user.setPassword("testService");
        user.setEmail("test@service.com");
        userService.add(user);
        System.out.println("new user add by service");


    }
}
