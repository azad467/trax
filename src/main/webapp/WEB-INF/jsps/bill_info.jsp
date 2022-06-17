<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill |Info</title>
</head>
<body>
	<h2>Bill |Info</h2>
	First Name:${bill.firstName}<br/>
	Last Name:${bill.lastName}<br/>
	Email:${bill.email}<br/>
	Mobile:${bill.mobile}<br/>
	product:${bill.product}<br/>
	Amount:${bill.amount}<br/>
	<form action="composeEmail" method="post">
	<input type="hidden" name="email" value="${lead.email}"/>
	<input type="submit" value="sendemail"/>
	</form>
	
	
</body>
</html>