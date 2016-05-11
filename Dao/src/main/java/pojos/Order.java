package pojos;

import javax.persistence.*;

/**
 * Created by KIRILL on 08.05.2016.
 */

@Entity                   //  annotation describe DB table how javaclass
@Table(name = "Order")       //  table name
public class Order {
    @Id
    @Column(name = "id")      //autoincrement identify explicitly column
    @GeneratedValue(strategy = GenerationType.AUTO)  // value autogenerate
    private int id;
    @Column(name = "mealId")
    private String mealId;
    @Column(name = "userId")
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
