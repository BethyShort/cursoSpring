<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/estilos.css" type="text/css"/>
</head>
<body>
	<form:form action="procesar" method="post" commandName="persona">
		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre"/>
		<form:errors path="nombre" cssClass="error"></form:errors><br />
		 
		<form:label path="edad">Edad</form:label>
		<form:input path="edad"/>
		<form:errors path="edad" cssClass="error"></form:errors><br />
		
		<form:button name="enviar">Enviar</form:button>
	</form:form>

</body>
</html>
