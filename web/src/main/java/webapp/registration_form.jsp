<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Title</title>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
<body>
<form method="post" action="LoginFilter">
    <input type="hidden" name="action" value="registration"/>
    <center>
        <table border="1" width="30%" cellpadding="5">
            <thead>
            <tr>
                <th colspan="2">Enter Information Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="firstName" value=""/></td>
            </tr>
            <tr>
                <td>Second Name</td>
                <td><input type="text" name="secondName" value=""/></td>
            </tr>
            <tr>
                <td>LOGIN</td>
                <td><input type="text" name="login" value=""/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" value=""/></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value=""/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
                <td><input type="reset" value="Reset"/></td>
            </tr>
            <tr>
                <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
            </tr>
            </tbody>
        </table>
    </center>
</form>
</body>
</html>