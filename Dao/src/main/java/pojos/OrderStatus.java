package pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by KIRILL on 08.05.2016.
 */
//@Entity                   //  annotation describe DB table how javaclass
//@Table(name = "OrderStatus",
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = "orderId")
//        })      //  table name and uniqueValue of "id"

public class OrderStatus {

    private int orderId;
    private int totalPrice;
    private int totalTime;
    private String orderStatus;

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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
