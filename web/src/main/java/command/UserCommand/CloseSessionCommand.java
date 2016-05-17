package command.UserCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.command.ICommand.ICommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KIRILL on 27.04.2016.
 */
public class CloseSessionCommand implements ICommand{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {
        request.setAttribute("currentUser",null);
        //request.getSession().invalidate();
        response.sendRedirect("index.jsp");
    }
}
