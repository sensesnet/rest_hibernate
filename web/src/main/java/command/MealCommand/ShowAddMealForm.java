package command.MealCommand;

import by.restaurantHibernate.Services.UserService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 28.04.2016.
 */
public class ShowAddMealForm implements iCommand {

    public static Logger logger = Logger.getLogger(UserService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        logger.info("execute show add form Meal start");
        String page = "/WEB-INF/view/meal/meal.jsp";
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            dispatcher.forward(request, response);
            logger.info("Meal add form was forward");

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
