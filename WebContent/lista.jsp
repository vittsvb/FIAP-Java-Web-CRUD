<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Funcionários</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: #f5f5f5
}
</style>
</head>
<body>
	<h3>Lista de Funcionários</h3>


	<c:choose>
		<c:when test="${lista== null}">
			<p>Nenhum Funcionário cadastrado</p>
		</c:when>
		<c:otherwise>
			<table style="border: 1px">
				<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Idade</th>
					<th>Salário</th>
				</tr>
				<c:forEach items="${lista}" var="i" varStatus="s">
					<c:choose>
						<c:when test="${i.salario < 2000}">
							<tr style="color: #f00">
								<td>${i.cpf}</td>
								<td>${i.nome}</td>
								<td>${i.idade}</td>
								<td>${i.salario}</td>
							</tr>
						</c:when>
						<c:otherwise>
							<tr style="color: #00f">
								<td>${i.cpf}</td>
								<td>${i.nome}</td>
								<td>${i.idade}</td>
								<td>${i.salario}</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>






</body>
</html>