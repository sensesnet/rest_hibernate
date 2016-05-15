package util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by KIRILL on 08.05.2016.
 * <p>
 * Hibernate work with session. At first session will open after hibernate create
 * transaction . In transaction  you can something with DB pojos after transaction
 * will be over after "commit" and session will "close".
 */
public class HibernateUtil {
    private static Logger log = Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;
    private static HibernateUtil util = null;
    private final ThreadLocal sessions = new ThreadLocal();

    public HibernateUtil() {
    }

    static {                                 // manager wort with session
        //  get session
        try {
            // take session
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            log.error("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }


    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }


    public static synchronized HibernateUtil getHibernateUtil(){
        if (util == null){
            util = new HibernateUtil();
        }
        return util;
    }

}
