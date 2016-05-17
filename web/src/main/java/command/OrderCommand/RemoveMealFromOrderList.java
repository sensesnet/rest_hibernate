package command.OrderCommand;

import by.restaurant.DaoExceptions.DaoException;
import by.restaurant.ServiceExeption.ServiceException;
import by.restaurant.Services.MealService;
import by.restaurant.Services.OrderService;
import by.restaurant.command.ICommand.ICommand;
import by.restaurant.pojos.Order;
import by.restaurant.pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by KIRILL on 29.04.2016.
 */
public class RemoveMealFromOrderList implements ICommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, DaoException, ServletException, IOException {
        String page = "/WEB-INF/view/user_page/Meals_LIST.jsp";
        User user = (User) request.getSession().getAttribute("currentUser");
        OrderService orderService = new OrderService();
        MealService mealService = new MealService();
        int orderId = request.getSession().hashCode();

        try {
            int mId = Integer.valueOf(request.getParameter("mealID"));
            orderService.remove(mId,orderId);
            List orderList = orderService.getById(request.getSession().hashCode());

            int summ = mealService.getTotalPrice(orderList);
            int timeToCook = mealService.getTotalTime(orderList);

            RequestDispatcher viewOrder = request.getRequestDispatcher(page);

            request.setAttribute("summWithSale",summ);
            request.setAttribute("summTimeToCook",timeToCook);

            request.setAttribute("meal", mealService.getAll());
            request.setAttribute("user",user);
            request.setAttribute("order",  orderService.getById(orderId));

            viewOrder.forward(request, response);

        } catch (DaoException | ServiceException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
