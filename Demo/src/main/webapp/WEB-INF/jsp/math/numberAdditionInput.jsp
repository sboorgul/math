<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Addition Problems</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div id="centered">
	<h3 align="center">Number Addition Problem Inputs</h3>
<form:form method="POST" action="/Logon-1.0/generate">	
	<table align="center">
		<form:label path="totalProblems">Total Problems</form:label>
		<form:input path="totalProblems" />
		<form:label path="level">Level</form:label>
		<form:input path="level" />
		<form:label path="startingNumber">Starting Number</form:label>
		<form:input path="startingNumber" />
		<form:label path="endingNumber">Ending Number</form:label>
		<form:input path="endingNumber" />
        <input type="submit" value="Submit"/>
	</table>	
</form:form>
	</div>
</body>
</html>