<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<title>Get Employee Page</title>
</head>
<body>
    <h1>Employee Information</h1>
    <p>
        Employee ID:${id}<br> Employee Name:${name}<br>
        <%
        String ses = "Jai";
        
        session.setAttribute("sess_param",ses);
        
        %>
    </p>
    <c:if test="${pageContext.request.userPrincipal.name != null}">
    Hi ${pageContext.request.userPrincipal.name}<br>
     
    <c:url var="logoutAction" value="/j_spring_security_logout"></c:url>
    
    <c:url var="sessionAction" value="/sesion"></c:url>
     
    <form action="${logoutAction}" method="post">
        <input type="submit" value="Logout" />
    </form>
    
    <form action="${sessionAction}" method="post">
        <input type="submit" value="session" />
    </form>
    </c:if>
</body>
</html>