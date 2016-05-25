<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All User</title>
</head>
<body>

<h1 align="center">Welcome to admin page.</h1>
<p align="center"><a href="Controller?action=closeSessionCommand">Log out</a></p>


<form action="Controller">
    <h2 align="center">List of User</h2>
    <table border="1" align="center">
        <tr align="center">
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>LOGIN</th>
            <th>PASSWORD</th>
            <th>EMAIL</th>
            <th>STATUS</th>

        </tr>
        <c:forEach items="${user}" var="user">
            <tr align="center">
                <td>${user.getId()}</td>
                <td>${user.getFirstName()}</td>
                <td>${user.getSecondName()}</td>
                <td>${user.getLogin()}</td>
                <td>${user.getPassword()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getStatus()}</td>

                <td align="center"><a
                        href="Controller?action=editUser&userID=<c:out value ="${user.getId()}"/>">Edit</a></td>
                <td align="center"><a
                        href="Controller?action=removeUser&userID=<c:out value ="${user.getId()}"/>">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p align="center"><a href="Controller?action=addUserFormCommand">Add new User</a></p>
</form>

</body>
</html>