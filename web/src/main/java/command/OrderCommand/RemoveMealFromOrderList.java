package command.OrderCommand;



import Services.MealService;
import Services.OrderService;
import command.iCommand.iCommand;
import pojos.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 29.04.2016.
 */
public class RemoveMealFromOrderList implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
//        String page = "/WEB-INF/view/user_page/Meals_LIST.jsp";
//        User user = (User) request.getSession().getAttribute("currentUser");
//        OrderService orderService = new OrderService();
//        MealService mealService = new MealService();
//        int orderId = request.getSession().hashCode();
//
//        try {
//            int mId = Integer.valueOf(request.getParameter("mealID"));
//            orderService.remove( orderService.getById(orderId));
//            List orderList = orderService.getById(request.getSession().hashCode());
//
//            int summ = mealService.getTotalPrice(orderList);
//            int timeToCook = mealService.getTotalTime(orderList);
//
//            RequestDispatcher viewOrder = request.getRequestDispatcher(page);
//
//            request.setAttribute("summWithSale",summ);
//            request.setAttribute("summTimeToCook",timeToCook);
//
//            request.setAttribute("meal", mealService.getAll());
//            request.setAttribute("user",user);
//            request.setAttribute("order",  orderService.getById(orderId));
//
//            viewOrder.forward(request, response);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
