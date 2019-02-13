<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="searchProfileById" modelAttribute="profile">
		Enter ProfileId:<input type="text" name="profileId" value=""/> <br /> <br />
		<input type="submit" value="submit"><br><br/> 
</spring:form>
</body>
</html>