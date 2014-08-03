<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Addition Problems</title>
<style type="text/css">
table, th, td {
    font-family: "Times New Roman", Times, serif;
    font-weight: bold;
    font-size: x-large;
} 
body {
	margin: 0;
	padding: 0;
	padding-top: 10px;
	text-align: center;
}

#centered {
	width: 100%;
	margin: 0 auto;
	padding: 0;
	padding-top: 10px;
	border: 0px;
	text-align: left;
}

#tableBold {
	font-family: sans-serif;
	font-size: 10px;
	font-weight: 11px;
	letter-spacing: 2px;
	border: thin;
}
</style>
</head>
<body>
	<div id="centered">
		<h3 align="centered">Number Addition Problems</h3>
		<form:form method="POST">
			
			<table id="tableBold">
			<tr>
				
				<c:forEach items="${numberAdditionOutput.numberProblems}" var="numberProblem" >
				
				<td>
					<table border=0>
						<c:forEach  items="${numberProblem.value.numbers}" var="numberAdditionFormat">
						<tr align="right">
							<td><c:out	value="${numberAdditionFormat.numberAdditionalInfo}" /></td>
							<td><c:out	value="${numberAdditionFormat.formatedNumber}" />&nbsp;&nbsp;&nbsp;</td>
						</tr>
						</c:forEach>
								
						<tr>
							<td colspan=4 align="center">---------------</td>
						</tr>
						<tr>
							<td colspan=4></td>
						</tr>
						<tr>
							<td colspan=4 align="center">---------------</td>
						</tr>
					</table>
				</td>
			
				<c:if test="${numberProblem.value.problemNumber%5==0}">
				</tr>
				<tr>
				</c:if>
				
			
			
			</c:forEach>
				</tr>
			</table>
			
			<div style="page-break-before: always;">
				<table border=0 align="left">
					<tr>
						Key:
						<c:forEach items="${numberAdditionOutput.numberProblems}" var="numberProblem">
							<td>
								<table border=0>
									<tr align="left">
										<td align="left">(<c:out value="${numberProblem.value.problemNumber}" />)
										</td>
										<td><c:out value="${numberProblem.value.answer}" /></td>
										<td>&nbsp;&nbsp;&nbsp;</td>
									</tr>
								</table>
							</td>
							<c:if test="${numberProblem.value.problemNumber%8==0}">
								</tr>
								<tr>
							</c:if>
						</c:forEach>
					</tr>
				</table>
			</div>
			
		</form:form>
	</div>
</body>
</html>