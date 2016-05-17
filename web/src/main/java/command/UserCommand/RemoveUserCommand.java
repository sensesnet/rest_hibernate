package command.UserCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.MealService;
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
public class RemoveUserCommand implements ICommand {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        String page = "/WEB-INF/view/user/User_LIST.jsp";

        UserService userService = new UserService();
        MealService mealService = new MealService();
        try {
            int uId = Integer.valueOf(request.getParameter("userID"));
            userService.remove(uId);
            RequestDispatcher viewUser = request.getRequestDispatcher(page);
            request.setAttribute("user", userService.getAll());
            request.setAttribute("meal", mealService.getAll());
            viewUser.forward(request, response);

        } catch (DaoException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
