.
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family:verdana">

<h5>Employee Name: ${emp.firstName } ${emp.lastName}</h5> 

<h6>Emp Id: ${emp.empId }</h6>

<h6>Department Name: ${emp.department }</h6>

<h6>Gender: ${emp.gender }</h6>

<h6>Proficiency In</h6>
<ul>
	<core:forEach items="${emp.profeciencyIn }" var="temp">
		<li>${temp }</li>
	</core:forEach>
</ul>


</body>
</html>