package by.restaurantHibernate.pojos;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * Created by KIRILL on 08.05.2016.
 */
@Entity                   //  annotation describe DB table how javaclass
//@Table(name = "MEAL")       //  table name
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Meal {

    @Id
    @Column(name = "id")      //autoincrement identify explicitly column
    @GeneratedValue(strategy = GenerationType.AUTO)  // value autogenerate
    private int id;

    @Column(name = "mealName")
    private String mealName;

    @Column(name = "mealPrice")
    private int mealPrice;

    @Column(name = "mealTime")
    private int mealTime;

    @Column(name = "mealConsist")
    private String mealConsist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(int mealPrice) {
        this.mealPrice = mealPrice;
    }

    public int getMealTime() {
        return mealTime;
    }

    public void setMealTime(int mealTime) {
        this.mealTime = mealTime;
    }

    public String getMealConsist() {
        return mealConsist;
    }

    public void setMealConsist(String mealConsist) {
        this.mealConsist = mealConsist;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", mealName='" + mealName + '\'' +
                ", mealPrice=" + mealPrice +
                ", mealTime=" + mealTime +
                ", mealConsist='" + mealConsist + '\'' +
                '}';
    }
}
