<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add New User</title>
</head>
<body>
<form method="POST" action="Controller" name="frmAddUser">
    <input type="hidden" name="action" value="AddMeal"/>
    <p><b>Add New Meal</b></p>
    <table>
        <tr>
            <td>Meal Name</td>
            <td><input type="text" name="mealName"/></td>
        </tr>
        <tr>
            <td>Meal PRICE (Int)</td>
            <td><input type="text" name="mealPrice"/></td>
        </tr>
        <tr>
            <td>Time to cook (Int min)</td>
            <td><input type="text" name="mealTime"/></td>
        </tr>
        <tr>
            <td>Consist</td>
            <td><input type="text" name="mealConsist"/></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Submit"/></td>
            <td><input type="reset" value="Reset_Fields" /></td>
        </tr>
    </table>
</form>
</body>
</html>