<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Employee details</title>
</head>
<body>

<h4>Enter details</h4>
<s:form action="write" modelAttribute="emp">

	Emp Id: <s:input path="empId" /><s:errors title="Please enter empId"></s:errors>
	
	First Name: <s:input path="firstName" /><br>
	Last Name: <s:input path="lastName"/><br>
	
	<s:select path="department">
		<s:options items="${ departments}"/>
	</s:select><br>
	
	Select Gender:<br>
	Male: <s:radiobutton path="gender" value="Male"/><br>
	Female: <s:radiobutton path="gender" value="Female"/><br>
	Other: <s:radiobutton path="gender" value="Other"/><br>
	
	proficiency In:<br>
	Java: <s:checkbox path="profeciencyIn" value="Java"/><br>
	DotNet: <s:checkbox path="profeciencyIn" value="DotNet"/><br>
	Php: <s:checkbox path="profeciencyIn" value="Php"/><br>
	
	<input type="submit" value="Submit Details">
	
	
</s:form>


</body>
</html>