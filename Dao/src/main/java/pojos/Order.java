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
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "mealId")
    private int mealId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "Status")
    private OrderStatus orderStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
