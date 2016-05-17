package Dao;

import org.hibernate.Session;
import pojos.Order;
import util.HibernateUtil;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KIRILL on 08.05.2016.
 */
public class OrderDao extends BaseDao {
    @Override
    public void add(Object o) throws SQLException {
        super.add(o);
    }

    @Override
    public void remove(Object o) throws SQLException {
        super.remove(o);
    }

    @Override
    public Object getById(Serializable id) throws SQLException {
        return super.getById(id);
    }

    @Override
    public List getAll() throws SQLException {
        return super.getAll();
    }

    @Override
    public void edit(Object o) throws SQLException {
        super.edit(o);
    }

    public List getById(int id) throws SQLException {
        List result = new ArrayList();
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {      //clean memory
                session.close();                   // close session
            }
            return result;
        }
    }
}
