<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Multiplication Worksheet Input Criteria</title>
</head>
<body>
	<div id="centered">
	<h3>Number Multiplication Problem Input Criteria</h3>
	<form:form  method="POST" action="/Logon-1.0/generatemul">
		<form:label path="totalProblems">Total Problems</form:label>
		<form:input path="totalProblems" />
		<form:label path="startingNumber">Begining Number</form:label>
		<form:input path="startingNumber" />
		<form:label path="endingNumber">Ending Number</form:label>
		<form:input path="endingNumber" />
		<form:label path="startingMultiplier">Begining Multiplier</form:label>
		<form:input path="startingMultiplier" />
		<form:label path="endingMultiplier">Ending Multiplier</form:label>
		<form:input path="endingMultiplier" />
		<input type="submit" value="Submit"/>	
	</form:form>
	</div>
</body>
</html>