<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Example</title>
</head>
<body>
<h1>Does not validate data. Try again.</h1>
<form method="post" action="LoginFilter">
    <center>
        <table border="1" width="30%" cellpadding="3">
            <thead>
            <tr>
                <th colspan="2">Login Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>User login</td>
                <td><input type="text" name="login" value="" placeholder="like@mail.com" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" value="" placeholder="123456" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="SingIN" /></td>
                <td><input type="reset" value="Reset" /></td>
            </tr>
            <tr>
                <td colspan="2">Yet Not Registered!! <a href="registration_form.jsp">Register Here</a></td>
            </tr>
            </tbody>
        </table>
    </center>
</form>
</body>
</html>
