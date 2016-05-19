package pojos;

import javax.persistence.*;

@Entity                   //  annotation describe DB table how javaclass
@Table(name = "Order_Status")       //  table name
public class OrderStatus {
    @Id
    @Column(name = "id")      //autoincrement identify explicitly column
    @GeneratedValue(strategy = GenerationType.AUTO)  // value autogenerate
    private int id;

    @Column(name = "order_Id")
    private int orderId;

    @Column(name = "total_Price")
    private int totalPrice;

    @Column(name = "total_Time")
    private int totalTime;

    @Column(name = "order_Status")
    private String orderStatus;


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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getOrderStatus() {return orderStatus;}

    public void setOrderStatus(String orderStatus) {this.orderStatus = orderStatus;}




}
