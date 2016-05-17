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
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 03.05.2016.
 */
public class SendOrderToCookCommand implements ICommand {
    public static Logger logger = Logger.getLogger(OrderStatusService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {

        logger.info("execute sendOrders start");
        String page = "/WEB-INF/view/order/Order_LIST.jsp";
        OrderStatusService orderStatusService = new OrderStatusService();

        try {

            int ordId = Integer.valueOf(request.getParameter("orderID"));
            Order_status orderStatus = orderStatusService.getById(ordId);
            orderStatus.setOrder_Status("to cook");
            orderStatusService.edit(orderStatus);
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            List ordersStatus = orderStatusService.getAll();
            request.setAttribute("orderStatus", ordersStatus);
            dispatcher.forward(request, response);


            logger.info("OrderStatus List was forward");
        } catch ( ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
