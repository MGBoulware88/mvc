<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<h1 class="text-primary text-center"><c:out value="${book.title}" /></h1>
	<p class="text-center"><span class="fw-bold">Description: </span><c:out value="${book.description}" /></p>
	<p class="text-center"><span class="fw-bold">Language: </span><c:out value="${book.language}" /></p>
	<p class="text-center"><span class="fw-bold">Number of Pages: </span><c:out value="${book.numberOfPages}" /></p>
</body>
</html>