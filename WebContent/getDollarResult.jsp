<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euros to Dollars Results</title>
</head>
<body>
	<p>${userBillfold.getEuros()}
		Euros convert to: <br /> ${userBillfold.getDollars()} Dollars <br />
	</p>
	<a href="index.jsp">Choose a new conversion</a>
</body>
</html>