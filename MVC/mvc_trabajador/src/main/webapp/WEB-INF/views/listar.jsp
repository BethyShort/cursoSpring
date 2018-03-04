<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Ejemplo MVC con JDBC</title>
</head>
<body>
	<h4>Listado de trabajadores: <c:out value="${trabajadores.size()}"></c:out></h4>
	<table border="0">
		<tr>
			<td>ID</td>
			<td>NOMBRE</td>
			<td>DEPARTAMENTO</td>
		</tr>
		<c:forEach items="${trabajadores}" var="tr">
			<tr>
				<td><c:out value="${tr.id}"></c:out>
				<td><c:out value="${tr.nombre}"></c:out>
				<td><c:out value="${tr.departamento}"></c:out>
			</tr>
		</c:forEach>
	</table>
	<p><a href="home">Volver al menu</a></p>
</body>
</html>