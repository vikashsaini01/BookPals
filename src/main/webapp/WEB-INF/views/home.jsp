<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    <h1>Hello world!</h1>
  	<c:url var="signout" value="j_spring_security_logout"></c:url>
  	<c:url var="editprofile" value="/bookuser/edit"></c:url>
    <P>The time is now</P>
    <a href="${signout}"> Logout</a>    
    <a href="${editprofile}">Edit Profile </a>
    
</body>
</html>