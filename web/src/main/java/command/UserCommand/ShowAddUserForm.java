package command.UserCommand;


import by.restaurantHibernate.Services.UserService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 27.04.2016.
 */
public class ShowAddUserForm implements iCommand {
    public static Logger logger = Logger.getLogger(UserService.class.getName());
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        logger.info("execute show add form Users start");
        String page = "/WEB-INF/view/user/user.jsp";

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            dispatcher.forward(request, response);
            logger.info("User add form was forward");

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
