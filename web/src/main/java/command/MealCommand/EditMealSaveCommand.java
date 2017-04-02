package command.MealCommand;


import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.Services.MealService;
import command.iCommand.iCommand;
import by.restaurantHibernate.pojos.Meal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class EditMealSaveCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, DaoException {
        MealService mealService = new MealService();
        try {
            int mId = Integer.valueOf(request.getParameter("mealId"));
            Meal meal = mealService.getById(mId);
            //meal.setId(mId);
            String mealName = request.getParameter("mealName");
            meal.setMealName(mealName);
            meal.setMealPrice(Integer.valueOf(request.getParameter("mealPrice")));
            meal.setMealTime(Integer.valueOf(request.getParameter("mealTime")));
            meal.setMealConsist(request.getParameter("mealConsist"));
            mealService.edit(meal);
            response.sendRedirect("Controller");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
