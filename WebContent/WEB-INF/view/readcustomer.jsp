<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read Customer Info</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
</head>
<body>
<h2>Enter Customer details</h2>
<s:form action="write" modelAttribute="customer">
	
	<s:input path="id"/><s:errors path="id" cssClass="error"></s:errors><br>
	
	<s:input path="firstName"/><s:errors path="firstName" cssClass="error"></s:errors><br>
	
	<s:input path="lastName"/><s:errors path="lastName" cssClass="error"></s:errors><br>
	
	<input type="submit" value="Submit Data">
	
</s:form>
</body>
</html>