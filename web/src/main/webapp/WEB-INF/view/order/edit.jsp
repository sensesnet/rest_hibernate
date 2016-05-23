<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="by.restaurantHibernate.pojos.User"%>
<%@ page import="by.restaurant.dao.UserDao"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit User</title>
</head>
<body>
<%
    User user = new User();
%>
<%
    UserDao dao = new UserDao();
%>
<form method="POST" action='UserHandler' name="frmEditUser"><input
        type="hidden" name="action" value="edit" /> <%
    String uid = request.getParameter("userId");
    if (!((uid) == null)) {
        int id = Integer.parseInt(uid);
        user = dao.getById(id);
%>



    <table>
        <tr>
            <td>User ID</td>
            <td><input type="text" name="userId" readonly="readonly"
                       value="<%=user.getUSER_ID()%>"></td>
        </tr>
        <tr>
            <td>First Name</td>
            <td><input type="text" name="firstName" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="lastName" /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="lastName" /></td>
        </tr>
        <tr>
            <td>Login</td>
            <td><input type="text" name="login" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" /></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" /></td>
        </tr>
        <tr>
            <td>Credits</td>
            <td><input type="text" name="credits" /></td>
        </tr>
        <tr>
            <td>Status</td>
            <td><input type="text" name="status" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>



    <%
        } else
            out.println("ID Not Found");
    %>
</form>
</body>
</html>