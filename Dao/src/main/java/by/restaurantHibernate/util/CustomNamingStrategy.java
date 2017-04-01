package by.restaurantHibernate.util;
import org.hibernate.cfg.DefaultNamingStrategy;

/**
 * Created by KIRILL on 20.05.2016.
 *
 *
 * Dosen't used name strategy in project
 */


public class CustomNamingStrategy extends DefaultNamingStrategy {

    public String classToTableName(String className) {
        return "T_" + super.classToTableName(className).toUpperCase();
    }

    public String propertyToColumnName(String propName) {
        return "F_" + super.propertyToColumnName(propName);
    }

    public String columnName(String columnName) {
        return columnName;
    }

    public String tableName(String tableName) {
        return tableName;
    }
}