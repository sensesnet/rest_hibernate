package command.iCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by KIRILL on 14.04.2016.
 */
public interface iCommand {
    void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException;
}
