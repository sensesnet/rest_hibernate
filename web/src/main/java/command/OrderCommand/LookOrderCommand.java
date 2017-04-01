package command.OrderCommand;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.Services.MealService;
import by.restaurantHibernate.Services.OrderService;
import by.restaurantHibernate.pojos.Meal;
import by.restaurantHibernate.pojos.Order;
import command.iCommand.iCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIRILL on 26.05.2016.
 */
public class LookOrderCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, DaoException {

        OrderService orderService = new OrderService();
        MealService mealService = new MealService();
        String page = "/WEB-INF/view/order/LookOrder.jsp";
        try {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);

            int orderId = Integer.parseInt(request.getParameter("orderID"));
            List orderBean = orderService.getByIdList(orderId);

            List<Meal> mealList = new ArrayList<>();
            for (int i = 0; i < orderBean.size(); i++) {
                Order order = (Order) orderBean.get(i);
                mealList.add(mealService.getById(order.getMealId()));
            }
            request.setAttribute("mealList", mealList);

            dispatcher.forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        }

    }
}


