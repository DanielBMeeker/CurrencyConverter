<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dollars to Euros Converter</title>
</head>
<body>
<h1>Dollars Converter</h1>
<form action="getEuroServlet" method="post">
Enter the amount of money you want to convert:
<input type="text" name="userDollars" size="10">
<input type="submit" value="Calculate Euro" />
</form>
</body>
</html>