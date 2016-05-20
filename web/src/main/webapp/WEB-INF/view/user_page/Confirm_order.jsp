<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order to admin</title>
</head>
<body>
<h1>Your order will be send to admin. If you need something else try again.</h1>
<p>USER :${user.FIRST_NAME} _ ${user.SECOND_NAME}</p>
<p>Order_ID :${orderID}</p>
<p>Order_summ_with_sale_5% :${priceWithSale} ($)</p>
<p>Order_time for cook :${TimeToCook} (minutes)</p>



<p><a href="Controller?action=sendMealToAdminCommand&orderID=${orderID}&price=${priceWithSale}">Confirm order</a></p>
<p><a href="Controller?action=closeSessionCommand">log out</a></p>
</body>
</html>