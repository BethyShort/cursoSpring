<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring-core"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DATOS DE LA SESSIÓN</title>
</head>
<body>
	<form:form modelAttribute="vistaBean" action="cambiarEstado" name="datos" id="f" method="POST" >
        <label>id sesión:</label>
        <form:input path="idSesion" readonly="true" size="40"/>
        <br/><br/>
        
        <label>estado anterior:</label>
        <form:input path="claseHija.valorAnterior" readonly="true"/><br/>
        <br/><br/>
        
        <label>estado:</label>
        <form:input path="claseHija.valor" readonly="true"/><br/>
        <br/></br>
        
		<input type="submit" value="enviar" />
	</form:form>
</body>
</html>