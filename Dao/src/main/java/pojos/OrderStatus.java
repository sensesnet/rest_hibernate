package pojos;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by KIRILL on 08.05.2016.
 */

@Entity                   //  annotation describe DB table how javaclass
@Table(name = "OrderStatus")       //  table name
public class OrderStatus {
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "totalPrice")
    private int totalPrice;
    @Column(name = "totalTime")
    private int totalTime;
    @Column(name = "orderStatus")
    private String orderStatus;
//    private Set<Order> orders;


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

//    public String getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(String orderStatus) {
//        this.orderStatus = orderStatus;
//    }
}
