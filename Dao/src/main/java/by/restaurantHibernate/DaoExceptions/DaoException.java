package by.restaurantHibernate.DaoExceptions;

/**
 * Created by KIRILL on 14.04.2016.
 */
public class DaoException extends Exception {

    public DaoException() {
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public DaoException(Throwable throwable) {  super(throwable);   }

    public DaoException(String message, Throwable throwable, boolean enableSuppression, boolean writableStackTrace) {
        super(message, throwable, enableSuppression, writableStackTrace);
    }
}
