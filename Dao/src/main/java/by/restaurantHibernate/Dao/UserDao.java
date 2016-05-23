package by.restaurantHibernate.Dao;

import by.restaurantHibernate.DaoExceptions.DaoException;
import by.restaurantHibernate.pojos.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class UserDao extends BaseDao {

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


    /**
     * method  to get USER by his login
     *
     * @param login
     * @return
     */
    public User getByLogin(String login) {
        Session session = hibernateUtil.getSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        User user = (User) criteria.uniqueResult();

        return user;


    }
}
