package command.OrderCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.OrderStatusService;
import by.restaurant.command.ICommand.ICommand;
import by.restaurant.pojos.Order_status;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KIRILL on 29.04.2016.
 */
public class SendMealToAdminCommand implements ICommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {
        OrderStatusService orderStatusService = new OrderStatusService();
        String page = "/WEB-INF/view/user_page/confirm.jsp";
        Order_status orderStatus = new Order_status();


        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        int ordId = Integer.valueOf(request.getParameter("orderID"));
        orderStatus.setOrder_ID(ordId);

        int price = Integer.valueOf(request.getParameter("price"));
        orderStatus.setOrder_Price(price);

        orderStatus.setOrder_Status("to admin");
        orderStatusService.add(orderStatus);


        dispatcher.forward(request, response);

    }
}
