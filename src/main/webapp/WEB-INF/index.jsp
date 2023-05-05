<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container d-flex flex-column justify-content-center gap-3 align-content-center p-5 margin-2">
		<h1>All Books</h1>
		<table class="table table-bordered table-striped table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Language</th>
					<th># Pages</th>
				</tr>
			</thead>
			<tbody>
				<!-- check if the fruit name starts with g and make text orange if true -->
				<c:forEach var="book" items="${allBooks}">
				<tr>
					<td class=""><c:out value="${book.id}"/></td>
					<td class=""><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
					<td class=""><c:out value="${book.language}"/></td>
					<td class=""><c:out value="${book.numberOfPages}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>