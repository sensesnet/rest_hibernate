package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.UserDetail;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class UserDetailDao extends BaseDao<UserDetail> {
    @Override
    public void add(UserDetail o) throws SQLException, DaoException {
        super.add(o);
    }

    @Override
    public void remove(UserDetail o) throws SQLException, DaoException {
        super.remove(o);
    }

    @Override
    public UserDetail getById(Serializable id) throws SQLException, DaoException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException, DaoException {
        return super.getAll();
    }

    @Override
    public void edit(UserDetail o) throws SQLException, DaoException {
        super.edit(o);
    }
}
