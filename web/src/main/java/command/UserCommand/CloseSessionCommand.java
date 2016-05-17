package command.UserCommand;


import command.iCommand.iCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KIRILL on 27.04.2016.
 */
public class CloseSessionCommand implements iCommand {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        request.setAttribute("currentUser",null);
        //request.getSession().invalidate();
        response.sendRedirect("index.jsp");
    }
}
