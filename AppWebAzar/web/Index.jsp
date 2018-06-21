<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Index
    Created on : 21-06-2018, 2:58:59
    Author     : Nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Prueba</title>
    </head>
    <body>
        <h1>Hello Menu!</h1>
        <jsp:include page="/getAllMenu" flush="true"/>
        <jsp:useBean id="menu" class="duoc.cl.jee010.azar.entity.Menu" scope="page"/>
        
        <c:forEach var="menu" items="${listadoMenus}">

            <div>
                Menu <c:out value="${menu.nombreMenu} "/> <br/>
                <span>Destino: <c:out value="${menu.destinoMenu}"/></span>
                <!--  -->
            </div>
        </c:forEach>
    </body>
</html>
