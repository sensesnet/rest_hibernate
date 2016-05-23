package command.MealCommand;



import by.restaurant.Services.MealService;
import pojos.Meal;
import command.iCommand.iCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class AddMealCommand implements iCommand {


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        Meal meal = new Meal();
        MealService mealService = new MealService();

        meal.setMealName(request.getParameter("mealName"));
        meal.setMealPrice(Integer.valueOf(request.getParameter("mealPrice")));
        meal.setMealTime(Integer.valueOf(request.getParameter("mealTime")));
        meal.setMealConsist(request.getParameter("mealConsist"));
        mealService.add(meal);
        response.sendRedirect("Controller");

    }

}
