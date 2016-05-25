package command.OrderCommand;


import by.restaurantHibernate.Services.OrderStatusService;
import command.iCommand.iCommand;
import by.restaurantHibernate.pojos.OrderStatus;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 29.04.2016.
 */
public class SendMealToAdminCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        OrderStatusService orderStatusService = new OrderStatusService();
        String page = "/WEB-INF/view/user_page/confirm.jsp";
        OrderStatus orderStatus = new OrderStatus();


        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        int ordId = Integer.valueOf(request.getParameter("orderID"));
        orderStatus.setOrderId(ordId);

        int price = Integer.valueOf(request.getParameter("price"));
        orderStatus.setTotalPrice(price);
        int time = Integer.valueOf(request.getParameter("time"));
        orderStatus.setTotalTime(time);

        orderStatus.setOrderStatus("to admin");
        orderStatusService.add(orderStatus);


        dispatcher.forward(request, response);

    }
}
