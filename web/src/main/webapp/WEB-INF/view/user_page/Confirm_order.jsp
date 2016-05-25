<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order to admin</title>
</head>
<body>
<h1 align="center">Your order will be send to admin. If you need something else try again.</h1>
<p align="center">USER :${user.firstName} _ ${user.secondName}</p>
<p align="center">Order_ID :${orderID}</p>
<p align="center">Order_summ :${priceWithSale} ($)</p>
<p align="center">Order_time for cook :${TimeToCook} (minutes)</p>




<table border="1" align="center">
    <tr>
        <th>Id</th>
        <th>Meal</th>
        <th>Price</th>
        <th>Time_to_cook</th>
        <th>Consist</th>

    </tr>
    <c:forEach items="${mealList}" var="mealList">
        <tr>
            <td>${mealList.id}</td>
            <td>${mealList.mealName}</td>
            <td>${mealList.mealPrice}</td>
            <td>${mealList.mealTime}</td>
            <td>${mealList.mealConsist}</td>

        </tr>
    </c:forEach>
</table>



<p align="center"><a href="Controller?action=sendMealToAdminCommand&orderID=${orderID}&price=${priceWithSale}&time=${TimeToCook}">Confirm order</a></p>
<p align="center"><a href="Controller?action=closeSessionCommand">log out</a></p>
</body>
</html>