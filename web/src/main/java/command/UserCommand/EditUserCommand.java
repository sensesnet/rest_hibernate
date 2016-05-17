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

/**
 * Created by KIRILL on 14.04.2016.
 */
public class EditUserCommand implements ICommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        UserService userService = new UserService();
        String page = "/WEB-INF/view/user/edit.jsp";

        try {
            int uId = Integer.valueOf(request.getParameter("userID"));
            request.setAttribute("user",userService.getById(uId));
            request.setAttribute("userID",uId);
            RequestDispatcher view = request.getRequestDispatcher(page);
            view.forward(request,response);

        } catch (DaoException | ServiceException | IOException | ServletException e) {
            e.printStackTrace();
        }
    }
}
