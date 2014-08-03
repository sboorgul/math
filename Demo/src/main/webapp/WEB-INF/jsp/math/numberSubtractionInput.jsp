<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Subtraction Problems</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	padding-top: 10px;
	text-align: center;
}

#centered {
	width: 1200px;
	margin: 0;
	padding: 0;
	padding-top: 10px;
	border: 0px;
	text-align: left;
}

#tableBold {
	font-family: sans-serif;
	font-size: large
	font-weight: lighter;
	letter-spacing: 2px;
	border: thin;
}
</style>
</head>
<body>

	<div id="centered">
	<h3>Number Addition Problem Inputs</h3>
	<form:form  method="POST" action="/Logon-1.0/generatesub">
			<form:label path="totalProblems">Total Problems</form:label>
			<form:input path="totalProblems" />
			<form:label path="startSubtractFromRange">Beginning Subtraction From</form:label>
			<form:input path="startSubtractFromRange" />
			<form:label path="endSubtractFromRange">Ending Subtraction From</form:label>
			<form:input path="endSubtractFromRange" />
			<form:label path="startSubtractToRange">Beginning Subtraction To</form:label>
			<form:input path="startSubtractToRange" />
			<form:label path="endSubtractToRange">Ending Subtraction To</form:label>
			<form:input path="endSubtractToRange" />
			<input type="submit" value="Submit"/>			
	</form:form>
	</div>
</body>
</html>