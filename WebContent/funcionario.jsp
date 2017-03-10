<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FUNCIONÁRIO</title>
</head>
<body>
	<table>
		<tr>
			<td>CPF:</td>
			<td>${funcionario.cpf}</td>
		</tr>
		<tr>
			<td>Nome:</td>
			<td>${funcionario.nome}</td>
		</tr>
		<tr>
			<td>Idade:</td>
			<td>${funcionario.idade}</td>
		</tr>
		<tr>
			<td>Salário: R$</td>
			<td>${funcionario.salario}</td>
		</tr>
		<tr>
			<td><input type="button" value="Voltar" /></td>
		</tr>
	</table>

</body>
</html>