<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
<h2>Lead | Create</h2>
<div>
${emailError}
</div>

<form action="savelead" method="post">
<pre>
	First Name<input type="text" name="firstName"/>
	Last Name<input type="text" name="lastName"/>
	Lead Source:<select name="LeadSource" >
				  <option value="radio">RadioChannel</option>
				  <option value="newspaper">NewsPaper</option>
				  <option value="tv">Tv</option>
				  <option value="online">Onlinei</option>
				</select>	
	email<input type="email" name="email"/>
	mobile<input type="text" name="mobile"/>
	<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>