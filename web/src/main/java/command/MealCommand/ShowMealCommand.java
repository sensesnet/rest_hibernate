package command.MealCommand;




import by.restaurant.Services.MealService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 17.04.2016.
 */
public class ShowMealCommand implements iCommand {
    public static Logger logger = Logger.getLogger(MealService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        logger.info("execute show all Meals for user start");
        String page = "/WEB-INF/view/user_page/Meals_LIST.jsp";

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            MealService mealService = new MealService();
            List mealList = mealService.getAll();

            request.setAttribute("meal", mealList);
            dispatcher.forward(request, response);
            logger.info("Meal List was forward");

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
