package command.MealCommand;



import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.Services.MealService;
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
public class EditMealCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        MealService mealService = new MealService();
        String page = "/WEB-INF/view/meal/edit.jsp";

        try {
            int mId = Integer.valueOf(request.getParameter("mealID"));
            request.setAttribute("meal",mealService.getById(mId));
            request.setAttribute("mealID",mId);
            RequestDispatcher view = request.getRequestDispatcher(page);
            view.forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
