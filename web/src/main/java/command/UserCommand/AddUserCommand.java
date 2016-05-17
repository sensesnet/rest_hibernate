package command.UserCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.UserService;
import by.restaurant.command.ICommand.ICommand;
import by.restaurant.dao.UserDao;
import by.restaurant.pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by KIRILL on 14.04.2016.
 */
public class AddUserCommand implements ICommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {

        User user = new User();
        user.setFIRST_NAME(request.getParameter("firstName"));
        user.setSECOND_NAME(request.getParameter("secondName"));
        user.setLOGIN(request.getParameter("login"));
        user.setPASSWORD(request.getParameter("password"));
        user.setEMAIL(request.getParameter("email"));
        user.setCREDITS(0);
        user.setSTATUS("user");
        UserService userService = new UserService();
        userService.add(user);
        response.sendRedirect("Controller");

    }


}


