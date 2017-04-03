package by.restaurantHibernate.iService;

import by.restaurantHibernate.pojos.OrderStatus;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 17.05.2016.
 */
public interface iOrderStatusService {
    List getAll() throws SQLException;               // get all user (list)

    /**
     *
     * @param orderStatus
     * @throws SQLException
     */
    void add(OrderStatus orderStatus) throws SQLException;         // "add" new user from User table

    void edit(OrderStatus orderStatus) throws SQLException;        // "edit" user from User table

    void remove(OrderStatus orderStatus) throws SQLException;      // "remove" user from User table

    OrderStatus  getById(int id) throws SQLException;        // "get" user by "id" from User table
}
