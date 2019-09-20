<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dollars to Euros Results</title>

</head>
<body>
	<p>${userBillfold.getDollars()}
		Dollars convert to: <br /> ${userBillfold.getEuros()} Euros <br />
	</p>
	<a href="index.jsp">Choose a new conversion</a>
</body>
</html>