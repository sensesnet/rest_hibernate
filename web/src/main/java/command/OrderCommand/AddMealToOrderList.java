package command.OrderCommand;


import by.restaurantHibernate.Services.MealService;
import by.restaurantHibernate.Services.OrderService;
import command.iCommand.iCommand;
import by.restaurantHibernate.pojos.Order;
import by.restaurantHibernate.pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;


/**
 * Created by KIRILL on 29.04.2016.
 */
public class AddMealToOrderList implements iCommand {


    public static Logger logger = Logger.getLogger(MealService.class.getName());


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException, SQLException {

        Order order = new Order();
        OrderService orderService = new OrderService();
        MealService mealService = new MealService();
        String page = "/WEB-INF/view/user_page/Meals_LIST.jsp";
        User user = (User) request.getSession().getAttribute("currentUser");
        int numOfSession = request.getSession().hashCode();


        order.setUserId(user.getId());
        order.setMealId(Integer.parseInt(request.getParameter("mealID")));
        order.setOrderId(numOfSession);
        orderService.add(order);


        try {
            List orderBean = orderService.getByIdList(numOfSession);
            int price = mealService.getTotalPrice(orderBean);
            int timeToCook = mealService.getTotalTime(orderBean);

            request.setAttribute("priceWithSale", price);
            request.setAttribute("TimeToCook", timeToCook);
            request.setAttribute("user", user);

            request.setAttribute("meal", mealService.getAll());
            request.setAttribute("order", orderBean);

            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            dispatcher.forward(request, response);
            logger.info("Meal List was forward");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
