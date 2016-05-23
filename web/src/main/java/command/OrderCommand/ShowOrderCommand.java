package command.OrderCommand;


import by.restaurant.Services.OrderStatusService;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by KIRILL on 21.04.2016.
 */
public class ShowOrderCommand implements iCommand {


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
        }  catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}