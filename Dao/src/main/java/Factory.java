
import Dao.UserDao;

/**
 * Created by KIRILL on 09.05.2016.
 */
public class Factory {
    private static Factory instanse = new Factory();

    public UserDao userDao;

    private Factory() {
    }

    public static Factory getInstanse() {
        return Factory.instanse;
    }

    public UserDao getUserDao() {
        if (userDao == null)
            userDao = new UserDao();
            return userDao;

    }

}
