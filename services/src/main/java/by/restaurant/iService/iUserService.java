package by.restaurant.iService;

import pojos.User;
import java.sql.SQLException;
import java.util.List;

public interface iUserService<T> {
    List getAll() throws SQLException;               // get all user (list)

    void add(User user) throws SQLException;         // "add" new user from User table

    void edit(User user) throws SQLException;        // "edit" user from User table

    void remove(User user) throws SQLException;      // "remove" user from User table

    User getById(int id) throws SQLException;        // "get" user by "id" from User table
}
