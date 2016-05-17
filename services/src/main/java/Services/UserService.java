package Services;

import Dao.Factory;
import iService.iUserService;
import Dao.UserDao;
import pojos.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class UserService implements iUserService {

    Factory factory = Factory.getInstanse();
    UserDao userDao = factory.getUserDao();

    @Override
    public List getAll() throws SQLException {
        return userDao.getAll();
    }

    @Override
    public void add(User user) throws SQLException {
        try {
            userDao.add(user);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Override
    public void edit(User user) throws SQLException {
        userDao.edit(user);
    }

    @Override
    public void remove(User user) throws SQLException {
        userDao.remove(user);
    }

    @Override
    public User getById(int id) throws SQLException {
        return (User) userDao.getById(id);
    }
}
