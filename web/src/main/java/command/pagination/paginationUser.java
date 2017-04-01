package command.pagination;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.Services.MealService;
import by.restaurantHibernate.Services.OrderStatusService;
import by.restaurantHibernate.Services.UserService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 25.05.2016.
 */
public class paginationUser implements iCommand {

    public static Logger logger = Logger.getLogger(paginationUser.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        logger.info("execute show pagination start");
        String page = "/WEB-INF/view/user/pagination.jsp";

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            UserService userService = new UserService();

            List userList = userService.getAll();
            int first = 0;


            int num = (userList.size())/3;
            List pageNumber = new ArrayList<>();
            for(int i = 0;i<=num;i++){
                pageNumber.add(i);
            }


            List paginatonList = userService.pagination(first, 3);
            request.setAttribute("user", paginatonList);
            request.setAttribute("pageNumber", pageNumber);

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
