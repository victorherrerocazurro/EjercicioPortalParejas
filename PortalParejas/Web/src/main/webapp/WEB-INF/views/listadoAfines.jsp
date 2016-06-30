<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Afines</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Genero</th>
			<th>Altura</th>
		</tr>
		<c:forEach items="${afines}" var="persona">
			<tr>
				<td>${persona.nombre}</td>
				<td>${persona.edad}</td>
				<td>${persona.genero}</td>
				<td>${persona.altura}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>