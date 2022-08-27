<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
<!-- Desde aqui apunto al archivo js.
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/index.js"></script>
 -->
<style><%@include file="/resources/css/formulario.css"%></style>
</head>

<body>

	<div align="center">
		<form:form action="mostrardetalles" modelAttribute="estudiante">
			<h1 id="h11" align="center">Ingresar datos.</h1>
			<table id="table1">

				<tr>
					<td align="right" class="style1">Nombre:</td>
					<td class="style1"><form:input path="nombre" /></td>
					<td class="style1"><form:errors path="nombre"
							style="color:red" /></td>
				</tr>
				<tr>
					<td align="right" class="style1">Apellido:</td>
					<td class="style1"><form:input path="apellido" /></td>
					<td class="style1"><form:errors path="apellido"
							style="color:red" /></td>
				</tr>
				<tr>
					<td align="right" class="style1">Matricula:</td>
					<td class="style1"><form:input path="matricula" /></td>
					<td class="style1"><form:errors path="matricula"
							style="color:red" /></td>
				</tr>
				<tr>
					<td align="right" class="style1">Telefono:</td>
					<td class="style1"><form:input path="telefono" /></td>
					<td class="style1"><form:errors path="telefono"
							style="color:red" /></td>
				</tr>
				<tr>
					<td align="right" class="style1">Edad:</td>
					<td class="style1"><form:input path="edad" /></td>
					<td class="style1"><form:errors path="edad" style="color:red" /></td>
				</tr>
				<tr>
					<td align="right" class="style1">Materias:</td>
					<td class="style1"><form:select path="optativa">
							<form:option value="Calculo I"></form:option>
							<form:option value="Etica I"></form:option>
							<form:option value="Historia Dominicana"></form:option>
						</form:select></td>
				</tr>
				<tr>
					<td align="right" class="style1"><strong>Sexo:</strong></td>
					<td class="style1">Hombre<form:radiobutton path="sexo"
							value="hombre" /></td>
					<td class="style1"><form:errors path="sexo" style="color:red" /></td>
				</tr>
				<tr>
					<td></td>
					<td class="style1">Mujer<form:radiobutton path="sexo"
							value="mujer" /></td>
				</tr>
				<tr>
					<td align="right" class="style1"><strong>Idiomas:</strong></td>
				</tr>
				<tr>
					<td></td>
					<td class="style1">Espanol<form:checkbox path="idiomas"
							value="Espanol" /></td>
					<td class="style1"><form:errors path="idiomas"
							style="color:red" /></td>
				</tr>
				<tr>
					<td></td>
					<td class="style1">Arabe<form:checkbox path="idiomas"
							value="Arabe" /></td>
				</tr>
				<tr>
					<td></td>
					<td class="style1">Ingles<form:checkbox path="idiomas"
							value="Ingles" /></td>
				</tr>
				<tr>
					<td></td>
					<td class="style1">Italiano<form:checkbox path="idiomas"
							value="Italiano" /></td>
				</tr>
			</table>
			<div align="center">
				<input type="submit" value="Enviar" id="enviar">
			</div>
		</form:form>
	</div>

</body>
</html>