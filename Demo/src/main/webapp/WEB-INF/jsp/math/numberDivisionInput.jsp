<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Division Worksheet Input Criteria</title>
</head>
<body>
	<div id="centered">
	<h3>Number Multiplication Problem Input Criteria</h3>
	<form:form method="POST" action="/Logon-1.0/generatediv">
		<form:label path="totalProblems">Total Problems</form:label>
		<form:input path="totalProblems" />
		<form:label path="startingDividend">Begining Dividend</form:label>
		<form:input path="startingDividend" />
		<form:label path="endingDividend">Ending Dividend</form:label>
		<form:input path="endingDividend" />
		<form:label path="startingDivisor">Begining Divisor</form:label>
		<form:input path="startingDivisor" />
		<form:label path="endingDivisor">Ending Divisor</form:label>
		<form:input path="endingDivisor" />
		<input type="submit" value="Submit"/>	
	</form:form>
	</div>
</body>
</html>