<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LISTADO DE CLIENTES</title>
</head>
<body>
	<h3>LISTADO DE CLIENTES</h3>
	<c:forEach var="cli" items="${clientes}">
		<p>${cli.nombre}</p>
	</c:forEach>
</body>
</html>