package pojos;

import javax.persistence.*;

@Entity
@Table(name="Order")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "order_Id", unique = false, nullable = false)
    private int orderId;

    @Column(name = "meal_Id", unique = false, nullable = false)
    private int mealId;

    @Column(name = "user_Id", unique = false, nullable = false)
    private int userId;

//    @ManyToOne( fetch = FetchType.LAZY)
//    //@Cascade(CascadeType.ALL)
//    @JoinColumn(name = "order_Id")
//    private OrderStatus orderStatus;
//
//    public OrderStatus getOrderStatus() {return orderStatus;}
//
//    public void setOrderStatus(OrderStatus orderStatus) {this.orderStatus = orderStatus;}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {return orderId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}

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
