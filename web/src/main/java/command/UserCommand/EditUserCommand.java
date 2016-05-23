package command.UserCommand;



import by.restaurant.Services.UserService;
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
public class EditUserCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        UserService userService = new UserService();
        String page = "/WEB-INF/view/user/edit.jsp";

        try {
            int uId = Integer.valueOf(request.getParameter("userID"));
            request.setAttribute("user",userService.getById(uId));
            request.setAttribute("userID",uId);
            RequestDispatcher view = request.getRequestDispatcher(page);
            view.forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
