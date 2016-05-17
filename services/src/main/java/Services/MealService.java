package Services;

import Dao.Factory;
import Dao.MealDao;
import iService.iMealService;
import pojos.Meal;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by KIRILL on 15.05.2016.
 */
public class MealService implements iMealService {

    Factory factory = Factory.getInstanse();
    MealDao mealDao = factory.getMealDao();

    @Override
    public List getAll() throws SQLException {
        return mealDao.getAll();
    }

    @Override
    public void add(Meal meal) throws SQLException {
        try{
            mealDao.add(meal);
        }catch(Exception e){
            throw new SQLException(e);
        }
    }

    @Override
    public void edit(Meal meal) throws SQLException {
              mealDao.edit(meal);
    }

    @Override
    public void remove(Meal meal) throws SQLException {
                mealDao.remove(meal);
    }

    @Override
    public Meal getById(Serializable id) throws SQLException {
        return (Meal) mealDao.getById(id);
    }

    public int getTotalPrice(List orderBean) {
        return 100;
    }

    public int getTotalTime(List orderBean) {
        return 200;
    }
}
