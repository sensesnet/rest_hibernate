package command.UserCommand;


import Services.MealService;
import Services.OrderStatusService;
import Services.UserService;
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
 * Created by KIRILL on 21.04.2016.
 */
public class ShowUserCommand implements iCommand {
    public static Logger logger = Logger.getLogger(UserService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        logger.info("execute show all Users start");
        String page = "/WEB-INF/view/user/User_LIST.jsp";

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            UserService userService = new UserService();
            List userList = userService.getAll();
            request.setAttribute("user", userList);

            MealService mealService = new MealService();
            List mealList = mealService.getAll();
            request.setAttribute("meal", mealList);

            OrderStatusService orderStatusService = new OrderStatusService();
            List orderStatus = orderStatusService.getAll();
            request.setAttribute("orderStatus", orderStatus);

            dispatcher.forward(request, response);
            logger.info("User List was forward");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
