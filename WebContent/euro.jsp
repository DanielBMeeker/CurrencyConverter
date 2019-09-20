<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euro Converter</title>
</head>
<body>
<h1>Euro Converter</h1>
<form action="getDollarServlet" method="post">
Enter the amount of money you want to convert:
<input type="text" name="userEuro" size="10">
<input type="submit" value="Calculate Dollar" />
</form>
</body>
</html>