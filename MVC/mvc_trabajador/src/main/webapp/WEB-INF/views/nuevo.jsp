<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Nuevo Trabajador</title>
</head>
<body>
	<h3>Nuevo Trabajador</h3>
	<form name="datos_trabajador" method="post" action="grabar">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" id="id" name="id" /></td> 
			</tr>
			<tr>
				<td>NOMBRE:</td>
				<td><input type="text" id="nombre" name="nombre" /></td>
			</tr>
			<tr>
				<td>DEPARTAMENTO:</td>
				<td><input type="text" id="departamento" name="departamento" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="grabar" value="Grabar"/></td>
				<td><input type="reset" name="reset" value="Reset"/></td>
			</tr>
		</table>	
	</form>
</body>
</html>