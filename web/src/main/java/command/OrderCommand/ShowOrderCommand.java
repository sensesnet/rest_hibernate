package command.OrderCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.Services.OrderStatusService;
import by.restaurant.command.ICommand.ICommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 21.04.2016.
 */
public class ShowOrderCommand implements ICommand {


    public static Logger logger = Logger.getLogger(OrderStatusService.class.getName());

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        logger.info("execute showOrders start");
        String page = "/WEB-INF/view/order/Order_LIST.jsp";
        OrderStatusService orderStatusService = new OrderStatusService();

        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            List orderStatus = orderStatusService.getAll();
            request.setAttribute("orderStatus", orderStatus);
            dispatcher.forward(request, response);


            logger.info("OrderStatus List was forward");
        } catch (DaoException | ServletException | IOException e) {
            e.printStackTrace();
        }

    }
}