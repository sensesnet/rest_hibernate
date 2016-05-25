<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All User</title>
</head>
<body>

<form action="Controller">
    <h2>Orders STATUS</h2>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Order Id</th>
            <th>Total Price</th>
            <th>Total Time</th>
            <th>Order Status</th>

        </tr>
        <c:forEach items="${orderStatus}" var="orderStatus">
            <tr>
                <td>${orderStatus.id}</td>
                <td>${orderStatus.orderId}</td>
                <td>${orderStatus.totalPrice}</td>
                <td>${orderStatus.totalTime}</td>
                <td>${orderStatus.orderStatus}</td>
                <td><a
                        href="Controller?action=sendOrderToCookCommand&orderID=<c:out value ="${orderStatus.getId()}"/>">Send order to cook</a></td>
                <td><a
                        href="Controller?action=removeOrderStatusCommand&orderID=<c:out value ="${orderStatus.getId()}"/>">Delete</a>
                </td>
                <td><a
                        href="Controller?action=lookOrderAdminCommand&orderID=<c:out value ="${orderStatus.getOrderId()}"/>">Look Order</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<p><a href="Controller?action=showAllUser">Go back to admin page</a></p>
<p><a href="Controller?action=closeSessionCommand">Log out</a></p>
</body>
</html>