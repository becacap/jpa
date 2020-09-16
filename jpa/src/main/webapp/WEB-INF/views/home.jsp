
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<title>JPA</title>
</head>
<body>

	<h1 align="center">LISTADO DE USUARIOS</h1>
	<div align="center">
		<table border="1">
			<tr align="center">
				<td>USUARIO</td>
				<td>CLAVE</td>
			</tr>
			<c:forEach items="${usuarios}" var="usuario">
				<tr align="center">
					<td>${usuario.usuario }</td>
					<td>${usuario.clave}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>