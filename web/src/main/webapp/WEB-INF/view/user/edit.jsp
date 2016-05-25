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
<form method="POST" action="Controller" name="frmEditUser">
    <input type="hidden" name="action" value="saveEditUser"/>
    <table>
        <tr>
            <td>User ID</td>
            <td><input type="text" name="userId" readonly="readonly"
                       value="${user.id}"></td>
        </tr>
        <tr>
            <td>First Name</td>
            <td><input type="text" name="firstName" value="${user.firstName}" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="secondName" value="${user.secondName}" /></td>
        </tr>
        <tr>
            <td>Login</td>
            <td><input type="text" name="login" value="${user.login}" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" value="${user.password}" /></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${user.email}" /></td>
        </tr>
        <tr>
            <td>Status</td>
            <td><input type="text" name="status" value="${user.status}" /></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form>
</body>
</html>