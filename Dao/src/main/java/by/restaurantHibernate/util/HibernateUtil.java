package by.restaurantHibernate.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


/**
 * Created by KIRILL on 08.05.2016.
 * <p>
 * Hibernate work with session. At first session will open after hibernate create
 * transaction . In transaction  you can do CRUD with DB by.restaurant.pojos after transaction
 * will be over after "commit" and session will "close".
 */


public class HibernateUtil {

    private static HibernateUtil util = null;
    private static Logger log = Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory = null;
    private final ThreadLocal sessions = new ThreadLocal();

    private HibernateUtil() {    }

        static {
            try {
                // Create the SessionFactory from hibernate.cfg.xml
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                // Make sure you log the exception, as it might be swallowed
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

    public Session getSession() {
        Session session = (Session) sessions.get();
        if (session == null) {
            session = sessionFactory.openSession();
            sessions.set(session);
        }

        return session;
    }

    /**
     * method to get HibernateUtil with opened SessionFactory
     *
     * @return
     */
    public static synchronized HibernateUtil getHibernateUtil() {
        if (util == null) {
            util = new HibernateUtil();
        }
        return util;
    }

    /**
     * close session and  clear ThreadLocal varible
     *
     * @param session
     */
    public void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
            sessions.remove();
        }
    }

}
