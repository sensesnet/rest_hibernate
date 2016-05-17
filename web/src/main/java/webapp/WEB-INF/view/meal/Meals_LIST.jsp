<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Menu</title>
</head>
<body>
<h1>Welcome from User page</h1>


<h2>Menu form</h2>
<form action="Controller">
    <table border="1">
        <tr>
            <th>*</th>
            <th>Meal_ID</th>
            <th>Meal</th>
            <th>Price</th>
            <th>Time_to_cook</th>
            <th>Consist</th>

        </tr>
        <c:forEach items="${meal}" var="meal">
            <tr>
                <td><input type="radio" name="dish" value="${meal.getMeal_ID()}">
                <td>${meal.getMeal_ID()}</td>
                <td>${meal.getMeal_NAME()}</td>
                <td>${meal.getMeal_PRICE()}</td>
                <td>${meal.getMeal_TIME()}</td>
                <td>${meal.getMeal_CONSIST()}</td>
                <td>
                    <a href="Controller?action=addMealToOrderList&mealID=<c:out value ="${meal.getMeal_ID()}"/>">AddToOrder</a>
                </td>
                </input></td>
            </tr>

        </c:forEach>

    </table>

</form>


<form action="Controller">
    <h2> Order form</h2>
    <h3>User_${user.getFIRST_NAME()}_${user.getSECOND_NAME()}</h3>

    <table border="1">
        <tr>
            <th>ORDER_MEAL_ID</th>



        </tr>
        <c:forEach items="${order}" var="order">
            <tr>
                <td>${order.getMeal_ID()}</td>
                <td>
                    <a href="Controller?action=removeMealFromOrderList&mealID=<c:out value ="${order.getMeal_ID()}"/>">Delete</a>
                </td>
            </tr>

        </c:forEach>
    </table>
</form>
<p>Order_summ_with_sale_5% :${priceWithSale} ($)</p>
<p>Order_time for cook :${TimeToCook} (minutes)</p>
<p><a href="Controller?action=sendMealToAdminCommand">send to admin</a></p>
<p><a href="Controller?action=closeSessionCommand">Log out</a></p>

</body>
</html>