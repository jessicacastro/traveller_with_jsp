<%@ page language="java" 
     contentType="text/html; charset=UTF-8" 
       pageEncoding="UTF-8"%>
<!--declarando o uso das TagLIBS -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>   
<!-- declarando o uso da propriede"Mensagem" que vamos 
     receber do controller -->
<jsp:useBean id="Mensagem" type="java.lang.String" 
              scope="request" />
<jsp:useBean id="TipoErro" type="java.lang.String" 
              scope="request" />
<!DOCTYPE html>
<html>
<head>
	<title>.: Erro :.</title>
</head>
<body>
	<h1>Erro!</h1>
	<hr>
	Mensagem de Erro: <c:out value="${Mensagem}" />
	<br>
	
	<c:choose>
    	<c:when test="${TipoErro=='voltaLogin'}">
        	<a href="./index.jsp">Voltar ao Login</a> 
        	<br />
    	</c:when>    
   		<c:otherwise>
        	<a href="./filtroVidaNoturna.jsp">Voltar</a> 
        	<br />
    	</c:otherwise>
	</c:choose>
</body>
</html>