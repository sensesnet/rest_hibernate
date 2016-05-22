package command.MealCommand;



import DaoExceptions.DaoException;
import Services.MealService;
import command.iCommand.iCommand;
import org.hibernate.service.spi.ServiceException;
import pojos.Meal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 28.04.2016.
 */
public class EditMealSaveCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, DaoException {
        MealService mealService = new MealService();
        int mId = Integer.valueOf(request.getParameter("mealId"));
        Meal meal = mealService.getById(mId);
        meal.setId(mId);
        meal.setMealName(request.getParameter("mealName"));
        meal.setMealPrice(Integer.valueOf(request.getParameter("mealPrice")));
        meal.setMealTime(Integer.valueOf(request.getParameter("mealTime")));
        meal.setMealConsist(request.getParameter("mealConsist"));
        mealService.edit(meal);
        response.sendRedirect("Controller");
    }
}
