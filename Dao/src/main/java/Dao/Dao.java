package Dao;

import DaoExceptions.DaoException;
import pojos.User;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public interface Dao<T> {

    public void add(T t) throws SQLException, DaoException;

    public void remove(T t) throws SQLException, DaoException;

    public T getById(Serializable id) throws SQLException, DaoException;

    public List<T> getAll() throws SQLException, DaoException;

    public void edit(T t) throws SQLException, DaoException;

}
