package command.UserCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.UserService;
import by.restaurant.command.ICommand.ICommand;
import by.restaurant.pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 22.04.2016.
 */
public class EditUserSaveCommand implements ICommand {
    public static Logger logger = Logger.getLogger(UserService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {


        UserService userService = new UserService();
        int uId = Integer.valueOf(request.getParameter("userId"));
        User user = userService.getById(uId);
        user.setUSER_ID(uId);
        String firstName = request.getParameter("firstName");
        user.setFIRST_NAME(firstName);
        user.setSECOND_NAME(request.getParameter("secondName"));
        user.setLOGIN(request.getParameter("login"));
        user.setPASSWORD(request.getParameter("password"));
        user.setEMAIL(request.getParameter("email"));
        user.setCREDITS(Integer.parseInt(request.getParameter("credits")));
        user.setSTATUS(request.getParameter("status"));
        userService.edit(user);
        response.sendRedirect("Controller");
    }

}

