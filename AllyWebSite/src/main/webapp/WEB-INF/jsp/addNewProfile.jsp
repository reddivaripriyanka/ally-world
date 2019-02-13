<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createNewProfie">
		Enter userName:<input type="text" name="userName" /> <br /> <br />
		Enter fullName: <input type="text" name="fullName" /><br /> <br /> 
		Enter Gender:<input type="radio" name="gender" value="male"> Male<br> <br /> 
		<input type="radio" name="gender" value="female"> Female<br><br/>
		Date of Birth: <input type="text" name="dateOfBirth"><br><br/>
		Enter PhoneNumber:<input type="text" name="phoneNumber" /> <br /> <br />
		Relationship status:<input type="radio" name="relationShipStatus" value="single"> single<br> <br /> 
		<input type="radio" name="relationShipStatus" value="married"> married<br><br/>
		Enter CurrentAddress:<input type="text" name="currentAddress" /> <br /> <br />
		Enter permanentAddress:<input type="text" name="permanentAddress" /> <br /> <br />
		<input type="submit" value="submit"><br><br/> <input type="Reset" value="Reset"><br><br/>
	</form>
	<br />
</body>
</html>