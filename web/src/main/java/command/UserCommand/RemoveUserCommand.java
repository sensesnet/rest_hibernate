package command.UserCommand;

import by.restaurant.Services.MealService;
import by.restaurant.Services.UserService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 14.04.2016.
 */
public class RemoveUserCommand implements iCommand {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        String page = "/WEB-INF/view/user/User_LIST.jsp";

        UserService userService = new UserService();
        MealService mealService = new MealService();
        try {
            int uId = Integer.valueOf(request.getParameter("userID"));
            userService.remove(userService.getById(uId));
            RequestDispatcher viewUser = request.getRequestDispatcher(page);
            request.setAttribute("user", userService.getAll());
            request.setAttribute("meal", mealService.getAll());
            viewUser.forward(request, response);

        }  catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
