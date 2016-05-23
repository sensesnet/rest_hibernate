package filters;



import by.restaurantHibernate.Services.UserService;
import org.hibernate.service.spi.ServiceException;
import by.restaurantHibernate.pojos.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KIRILL on 14.04.2016.
 */

@WebServlet(name = "LoginFilter", urlPatterns = "/LoginFilter")
public class LoginFilter extends HttpServlet {


    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            String login = request.getParameter("login");
            String password = request.getParameter("password");
            UserService loginService = new UserService();
            boolean result = loginService.authenticateUser(login, password);
            User user = loginService.getByLogin(login);

            if(result == true){
                request.getSession().setAttribute("user", user);
                response.sendRedirect("home.jsp");
            }
            else{
                response.sendRedirect("reIndex.jsp");
            }
        }
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
//        UserService userService = new UserService();
//
//
//        User user = null;
//        if (login != null) {
//            try {
//                user = userService.getByLogin(login);
//            } catch (ServiceException e) {
//                e.printStackTrace();
//            }
//        } else {
//            response.sendRedirect("reIndex.jsp");
//        }
//        if ((user != null) && (user.getPassword().equals(password))) {
//            request.getSession().setAttribute("currentUser", user);
//            response.sendRedirect("Controller");
//
//        } else response.sendRedirect("reIndex.jsp");

//    }
}
