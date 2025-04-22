<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href='addstudentform' class='btn btn-primary'>Add Student</a>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Roll Number</th>
					<th scope="col">Student Name</th>
					<th scope="col">Percentage</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${students}">
					<tr>
						<td>${student.rno}</td>
						<td>${student.sname}</td>
						<td>${student.per}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>