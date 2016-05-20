package util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Created by KIRILL on 08.05.2016.
 * <p>
 * Hibernate work with session. At first session will open after hibernate create
 * transaction . In transaction  you can do CRUD with DB pojos after transaction
 * will be over after "commit" and session will "close".
 */


public class HibernateUtil {

    private static HibernateUtil util = null;
    private static Logger log = Logger.getLogger(HibernateUtil.class);
    private SessionFactory sessionFactory = null;
    private final ThreadLocal sessions = new ThreadLocal();

    private HibernateUtil() {

        try {
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration
                    .setNamingStrategy(new CustomNamingStrategy())
                    .buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            log.error("Initial SessionFactory creation failed." + ex);
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
    public static synchronized HibernateUtil getHibernateUtil() throws Throwable {
        if (util == null) {
            util = new HibernateUtil();
        }
        return util;
    }

    /**
     * close session and  clear ThreadLocal varible
     * @param session
     */
    public void closeSession(Session session) {
        if (session != null && session.isOpen()) {
            session.close();
            sessions.remove();
        }
    }

}
