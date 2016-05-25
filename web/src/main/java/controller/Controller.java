package controller;



import by.restaurantHibernate.DaoExceptions.DaoException;
import command.MealCommand.*;
import command.OrderCommand.*;
import command.UserCommand.*;
import command.iCommand.iCommand;
import by.restaurantHibernate.pojos.User;
import command.pagination.paginationClick;
import command.pagination.paginationUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 14.04.2016.
 */
@WebServlet("/Controller")

public class Controller extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();

        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action");
        iCommand com = null;
        User user = (User) request.getSession().getAttribute("currentUser");


        if (user == null) {
            action = "closeSessionCommand";
            com = new CloseSessionCommand();
        }



// use action work with admin form

        if (user.getStatus().equalsIgnoreCase("admin")) {



            if (action == null) {
                com = new ShowUserCommand();

            } else if (action.equalsIgnoreCase("showAllUser")) {
                com = new ShowUserCommand();
            } else if (action.equalsIgnoreCase("addUser")) {
                com = new AddUserCommand();
            } else if (action.equalsIgnoreCase("editUser")) {
                com = new EditUserCommand();
            } else if (action.equalsIgnoreCase("saveEditUser")) {
                com = new EditUserSaveCommand();
            } else if (action.equalsIgnoreCase("removeUser")) {
                com = new RemoveUserCommand();
            } else if (action.equalsIgnoreCase("closeSessionCommand")) {
                com = new CloseSessionCommand();
            } else if (action.equalsIgnoreCase("addUserFormCommand")) {
                com = new ShowAddUserForm();
            } else if (action.equalsIgnoreCase("paginationUser")) {
                com = new paginationUser();
            } else if (action.equalsIgnoreCase("paginationClick")) {
                com = new paginationClick();
            }

            //work with meal form and table

            else if (action.equalsIgnoreCase("removeMeal")) {
                com = new RemoveMealCommand();
            } else if (action.equalsIgnoreCase("addMealFormCommand")) {
                com = new ShowAddMealForm();
            } else if (action.equalsIgnoreCase("addMeal")) {
                com = new AddMealCommand();
            } else if (action.equalsIgnoreCase("editMeal")) {
                com = new EditMealCommand();
            } else if (action.equalsIgnoreCase("saveEditMeal")) {
                com = new EditMealSaveCommand();
            }else if (action.equalsIgnoreCase("showOrderCommand")) {
                com = new ShowOrderCommand();
            }else if (action.equalsIgnoreCase("sendOrderToCookCommand")) {
                com = new SendOrderToCookCommand();
            }else if (action.equalsIgnoreCase("removeOrderStatusCommand")) {
                com = new RemoveOrderStatusCommand();
            }

        }

//work with user form
        if (user.getStatus().equalsIgnoreCase("user")) {
            if (action == null) {
                com = new ShowMealCommand();

            }else if (action.equalsIgnoreCase("showMealForm")) {
                com = new ShowMealCommand();
            }else if (action.equalsIgnoreCase("closeSessionCommand")) {
                com = new CloseSessionCommand();

            }else if (action.equalsIgnoreCase("addMealToOrdercheckboxList")) {
                com = new AddMealToOrdercheckboxList();
            }else if (action.equalsIgnoreCase("sendMealToAdminCommand")) {
                com = new SendMealToAdminCommand();
            }

        }

        try {
            com.execute(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }


}
