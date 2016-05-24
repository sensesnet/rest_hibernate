package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.Meal;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class MealDao extends BaseDao<Meal> {
    @Override
    public void add(Meal meal) throws SQLException, DaoException {
        super.add(meal);
    }

    @Override
    public void remove(Meal meal) throws SQLException, DaoException {
        super.remove(meal);
    }

    @Override
    public Meal getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(Meal meal) throws SQLException, DaoException {
        super.edit(meal);
    }
}
