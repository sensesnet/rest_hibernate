package command.UserCommand;




import by.restaurantHibernate.Services.UserService;
import command.iCommand.iCommand;
import by.restaurantHibernate.pojos.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


/**
 * Created by KIRILL on 14.04.2016.
 */
public class AddUserCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setSecongName(request.getParameter("secondName"));
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setStatus("user");
        UserService userService = new UserService();
        userService.add(user);
        response.sendRedirect("Controller");

    }


}


