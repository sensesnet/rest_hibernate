package command.UserCommand;




import Services.UserService;
import command.iCommand.iCommand;
import pojos.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 22.04.2016.
 */
public class EditUserSaveCommand implements iCommand {
    public static Logger logger = Logger.getLogger(UserService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {


        UserService userService = new UserService();
        int uId = Integer.valueOf(request.getParameter("userId"));
        User user = userService.getById(uId);
        user.setId(uId);
        String firstName = request.getParameter("firstName");
        user.setFirstName(firstName);
        user.setSecongName(request.getParameter("secondName"));
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setStatus(request.getParameter("status"));
        userService.edit(user);
        response.sendRedirect("Controller");
    }

}

