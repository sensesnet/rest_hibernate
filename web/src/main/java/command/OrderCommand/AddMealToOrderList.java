package command.OrderCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.MealService;
import by.restaurant.Services.OrderService;
import by.restaurant.command.ICommand.ICommand;
import by.restaurant.pojos.Meal;
import by.restaurant.pojos.Order;
import by.restaurant.pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;


/**
 * Created by KIRILL on 29.04.2016.
 */
public class AddMealToOrderList implements ICommand {


    public static Logger logger = Logger.getLogger(MealService.class.getName());


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {

        Order order = new Order();
        OrderService orderService = new OrderService();
        MealService mealService = new MealService();
        String page = "/WEB-INF/view/user_page/Meals_LIST.jsp";
        User user = (User) request.getSession().getAttribute("currentUser");
        int numOfSession = request.getSession().hashCode();


        order.setUser_ID(user.getUSER_ID());
        order.setMeal_ID(Integer.parseInt(request.getParameter("mealID")));
        order.setOrder_ID(numOfSession);


        orderService.add(order);

        try {


            List orderBean = orderService.getById(numOfSession);
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

        } catch (ServletException | IOException | DaoException | ServiceException e) {
            e.printStackTrace();
        }
    }
}
