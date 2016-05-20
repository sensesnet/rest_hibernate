package iService;

import pojos.Order;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public interface iOrderService {
    List getAll() throws SQLException;

    void add(Order order) throws SQLException;

    void edit(Order order) throws SQLException;

    void remove(Order order) throws SQLException;

    Order getById(int id) throws SQLException;
}
