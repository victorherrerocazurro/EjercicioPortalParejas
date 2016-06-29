<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ideal</title>
</head>
<body>
	<c:if test="${ideal ne null}">
		<div>${ideal.nombre}</div>
		<div>${ideal.apellido}</div>
		<div>${ideal.edad}</div>
		<div>${ideal.sexo}</div>
		<div>${ideal.altura}</div>
	</c:if>
</body>
</html>