package command.OrderCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.OrderStatusService;
import by.restaurant.command.ICommand.ICommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KIRILL on 14.04.2016.
 */
public class RemoveOrderStatusCommand implements ICommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "/WEB-INF/view/order/Order_LIST.jsp";

        OrderStatusService orderStatusService = new OrderStatusService();
        try {
            int orId = Integer.valueOf(request.getParameter("orderID"));
            orderStatusService.remove(orId);
            RequestDispatcher viewUser = request.getRequestDispatcher(page);
            request.setAttribute("orderStatus", orderStatusService.getAll());
            viewUser.forward(request, response);

        } catch (DaoException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
