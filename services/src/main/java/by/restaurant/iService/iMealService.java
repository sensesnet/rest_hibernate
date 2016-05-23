package by.restaurant.iService;

import DaoExceptions.DaoException;
import pojos.Meal;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public interface iMealService {
    List getAll() throws SQLException;

    void add(Meal meal) throws SQLException;

    void edit(Meal meal) throws SQLException;

    void remove(Meal meal) throws SQLException;

    Meal getById(Serializable id) throws SQLException, DaoException;
}
