<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>success</h1>
	<table>
		<tr>
			<th>userName</th>
			<th>fullName</th>
			<th>gender</th>
			<th>dateOfBirth</th>
			<th>phoneNumber</th>
			<th>relationShipStatus</th>
			<th>currentAddress</th>
			<th>permanentAddress</th>
		</tr>
		<jstl:if test="${profile !=null}">
			<tr>
				<td>${profile.userName }</td>
				<td>${profile.fullName}</td>
				<td>${profile.gender}</td>
				<td>${profile.dateOfBirth}</td>
				<td>${profile.phoneNumber}</td>
				<td>${profile.relationShipStatus}</td>
				<td>${profile.currentAddress}</td>
				<td>${profile.permanentAddress}</td>
			</tr>
		</jstl:if>
		<jstl:if test="${profiles !=null}">
			<jstl:forEach var="profile" items="${profiles}">
				<tr>
					<td>${profile.userName }</td>
					<td>${profile.fullName}</td>
					<td>${profile.gender}</td>
					<td>${profile.dateOfBirth}</td>
					<td>${profile.phoneNumber}</td>
					<td>${profile.relationShipStatus}</td>
					<td>${profile.currentAddress}</td>
					<td>${profile.permanentAddress}</td>
				<tr>
			</jstl:forEach>
		</jstl:if>
	</table>

</body>
</html>