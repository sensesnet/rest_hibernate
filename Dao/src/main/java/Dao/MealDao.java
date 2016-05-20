package Dao;

import DaoExceptions.DaoException;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class MealDao extends BaseDao {
    @Override
    public void add(Object o) throws SQLException, DaoException {
        super.add(o);
    }

    @Override
    public void remove(Object o) throws SQLException, DaoException {
        super.remove(o);
    }

    @Override
    public Object getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(Object o) throws SQLException, DaoException {
        super.edit(o);
    }
}
