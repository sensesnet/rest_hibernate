<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit User</title>
</head>
<body>
<form method="POST" action="Controller" name="frmEditMeal">
    <input type="hidden" name="action" value="saveEditMeal"/>
    <table>
        <tr>
            <td>Meal ID</td>
            <td><input type="text" name="mealId" readonly="readonly"
                       value="${mealID}"></td>
        </tr>
        <tr>
            <td>MEAL</td>
            <td><input type="text" name="mealName" value="${meal.getMeal_NAME()}" /></td>
        </tr>
        <tr>
            <td>PRICE</td>
            <td><input type="text" name="mealPrice" value="${meal.getMeal_PRICE()}" /></td>
        </tr>
        <tr>
            <td>TIME_TO_COOK</td>
            <td><input type="text" name="mealTime" value="${meal.getMeal_TIME()}" /></td>
        </tr>
        <tr>
            <td>CONSIST</td>
            <td><input type="text" name="mealConsist" value="${meal.getMeal_CONSIST()}" /></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form>
</body>
</html>