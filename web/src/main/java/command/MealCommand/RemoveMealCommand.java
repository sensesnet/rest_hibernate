package command.MealCommand;



import DaoExceptions.DaoException;
import by.restaurant.Services.MealService;
import by.restaurant.Services.UserService;
import command.iCommand.iCommand;
import pojos.Meal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 14.04.2016.
 */
public class RemoveMealCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "/WEB-INF/view/user/User_LIST.jsp";

        MealService mealService = new MealService();
        UserService userService = new UserService();
        try {
            int mId = Integer.valueOf(request.getParameter("mealID"));
            Meal meal = mealService.getById(mId);
            mealService.remove(meal);
            RequestDispatcher viewUser = request.getRequestDispatcher(page);
            request.setAttribute("meal", mealService.getAll());
            request.setAttribute("user", userService.getAll());
            viewUser.forward(request, response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
