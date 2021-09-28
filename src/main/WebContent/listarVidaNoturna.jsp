<%@ page 
   language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="User" type="model.Usuario" scope="session"/>
<jsp:useBean id="Locais" type="java.util.ArrayList" scope="request" />

<!DOCTYPE html>
<html>
<head>
<title>.: Confira seus locais de vida noturna :.</title>
</head>
<body>
    <h1> Olá, <c:out value="${User.nome}" />!</h1>
    <hr/>
    <p>Os locais de vida noturna da categoria selecionada são:</p>
    <c:forEach items="${Locais}" var="local">
       Nome do Local: <c:out value="${local.nome}"/> <br>
       Endereço: <c:out value="${local.endereco}"/> <br>
       Valor de Gasto Aproximado: <c:out value="${local.valorAproximado}"/> <br>
       Classificação: <c:out value="${local.classificacao}"/> estrela(s) <br>
    <hr>
    </c:forEach>

</body>
</html>