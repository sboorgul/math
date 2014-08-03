<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	width: 1200px;
	padding: 0;
	padding-top: 10px;
	border: 0px;
	text-align: left;
}

#tableBold {
	font-family: sans-serif,serif;
	font-size: large
	font-weight: medium;
	letter-spacing: 2px;
	border: thin;
}
</style>
</head>
<body>
	<div id="centered">
		<h3 id="centered">Number Subtraction Problems</h3>
		<form:form method="POST">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberSubtractionOutput.subtractionProblems}"
						var="numberSubtractionProblem">
						<td>
							<table border=0>
									<tr >
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberSubtractionProblem.value.problemNumber}" />)</span></td>
										<td align="right"><c:out
												value="${numberSubtractionProblem.value.subtractFrom}" /></td>
									</tr>
									<tr>
									    <td></td>			
										<td align="right">-<c:out
												value="${numberSubtractionProblem.value.subtractTo}" /></td>
									</tr>
								<tr>
									<td colspan=2 align="center">---------------</td>
								</tr>
								<tr>
									<td colspan=2></td>
								</tr>
								<tr>
									<td colspan=2 align="center">---------------</td>
								</tr>
							</table>
						</td>
						<c:if test="${numberSubtractionProblem.value.problemNumber%5==0}">
							</tr>
							<tr>
						</c:if>
					</c:forEach>
				</tr>
			</table>
			<div style="page-break-before: always;">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberSubtractionOutput.subtractionProblems}"
						var="numberSubtractionProblem">
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberSubtractionProblem.value.problemNumber}" />)</span></td>
										<td align="right"><c:out value="${numberSubtractionProblem.value.answer}" /></td>
						<c:if test="${numberSubtractionProblem.value.problemNumber%5==0}">
							</tr>
							<tr>
						</c:if>
					</c:forEach>
				</tr>
			</table>
			
			</form:form>
	</div>
</body>
</html>