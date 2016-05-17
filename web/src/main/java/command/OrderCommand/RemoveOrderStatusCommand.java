package command.OrderCommand;


import Services.OrderStatusService;
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
public class RemoveOrderStatusCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "/WEB-INF/view/order/Order_LIST.jsp";

        OrderStatusService orderStatusService = new OrderStatusService();
        try {
            int orId = Integer.valueOf(request.getParameter("orderID"));
            orderStatusService.remove(orderStatusService.getById(orId));
            RequestDispatcher viewUser = request.getRequestDispatcher(page);
            request.setAttribute("orderStatus", orderStatusService.getAll());
            viewUser.forward(request, response);

        }  catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
