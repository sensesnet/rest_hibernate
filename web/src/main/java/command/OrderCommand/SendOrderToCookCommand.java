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
import java.util.List;
import java.util.logging.Logger;


public class SendOrderToCookCommand implements iCommand {
    public static Logger logger = Logger.getLogger(OrderStatusService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {

        logger.info("execute sendOrders start");
        String page = "/WEB-INF/view/order/Order_LIST.jsp";
        OrderStatusService orderStatusService = new OrderStatusService();

        try {

            int ordId = Integer.valueOf(request.getParameter("orderID"));
            OrderStatus orderStatus = orderStatusService.getById(ordId);
            orderStatus.setOrderStatus("to cook");
            orderStatusService.edit(orderStatus);
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            List ordersStatus = orderStatusService.getAll();
            request.setAttribute("orderStatus", ordersStatus);
            dispatcher.forward(request, response);


            logger.info("OrderStatus List was forward");
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
