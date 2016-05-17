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
<form method="POST" action="Controller">
    <input type="hidden" name="action" value="addMealToOrdercheckboxList"/>
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
                <td><input type="checkbox" name="dish" value="${meal.getMeal_ID()}"/></td>
                <td>${meal.getMeal_ID()}</td>
                <td>${meal.getMeal_NAME()}</td>
                <td>${meal.getMeal_PRICE()}</td>
                <td>${meal.getMeal_TIME()}</td>
                <td>${meal.getMeal_CONSIST()}</td>
            </tr>

        </c:forEach>

    </table>
        <input type="submit" value="sendToAdmin"/>
</form>
<p><a href="Controller?action=closeSessionCommand">Log out</a></p>
</body>
</html>