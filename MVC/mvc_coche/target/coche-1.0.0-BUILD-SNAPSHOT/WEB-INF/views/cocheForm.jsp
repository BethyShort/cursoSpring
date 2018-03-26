<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd ">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html xmlns="http://www.w3.org/1999/xhtml ">
 
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <title>Prueba de Formulario de validación con Spring MVC 3.1</title>
    <style type="text/css">
        body {
            font-family: verdana, sans-serif;           
        }
         
        span.campoConError {
            color: red;
        }
         
    </style>  
</head>
 
<body>
                 
    <c:url value="/manejar" var="destino"/>           
    <form:form method="post" action="${destino}" commandName="datosCoche">                            
                 
        <h1>Formulario con datos del coche</h1>

                 
        <table>
            <tbody><tr>
                <td>Matrícula:</td>
                <td><form:input path="matricula" /></td> 
                <td><form:errors path="matricula" cssClass="campoConError"/></td>
            </tr>
            <tr>
                <td>Modelo:</td>
                <td><form:input path="modelo" /></td> 
                <td><form:errors path="modelo" cssClass="campoConError"/></td>
            </tr>
            <tr>
                <td>Año:</td>
                <td><form:input path="anho" maxlength="4" /></td> 
                <td><form:errors path="anho" cssClass="campoConError"/></td>
            </tr>
            <tr>
                <td>Kilómetros:</td>
                <td><form:input path="kilometros" maxlength="6" /></td> 
                <td><form:errors path="kilometros" cssClass="campoConError"/></td>
            </tr>
            <tr>
                <td colspan="3">
                	<form:button  value="Enviar" name="enviar">Enviar</form:button>
                    <!-- <input type="submit" value="Enviar" />--> 
                </td>
            </tr>
        </tbody></table>
                                                     
    </form:form>    
    
                 
</body>
</html>
