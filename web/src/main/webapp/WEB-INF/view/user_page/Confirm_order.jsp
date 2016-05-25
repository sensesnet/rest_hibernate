<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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
<p align="center">Order_summ_with_sale_5% :${priceWithSale} ($)</p>
<p align="center">Order_time for cook :${TimeToCook} (minutes)</p>



<p align="center"><a href="Controller?action=sendMealToAdminCommand&orderID=${orderID}&price=${priceWithSale}">Confirm order</a></p>
<p align="center"><a href="Controller?action=closeSessionCommand">log out</a></p>
</body>
</html>