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
	font-weight: x-large;
	letter-spacing: 2px;
	border: thin;
}
</style>
</head>
<body>
	<div id="centered">
		<h3 id="centered">Number Division Problems</h3>
		<form:form action="NumberDivisionWorksheetOutput">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberDivisionOutput.divisionProblems}"
						var="numberDivisionProblem">
						<td>
							<table border=0>
									<tr style="margin: 0px,0px,0px,0px;padding: 0px,0px,0px,0px">
									  
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberDivisionProblem.value.problemNumber}" />)</span></td>
			                              
										<td colspan=2 align="center" valign="bottom">---------------</td>
									</tr>
									<tr style="margin: 0px,0px,0px,0px;padding: 0px,0px,0px,0px"  align="right" valign="top">
									    <td></td>										
										<td align="right" valign="top"><c:out
												value="${numberDivisionProblem.value.divisor}" />)</td>
										<td align="left"><c:out
												value="${numberDivisionProblem.value.formatDividend}" /></td>
												
									</tr>
									<tr><td><br><br><br><br><br></tr>
							</table>
						</td>
						<s:if test="${numberDivisionProblem.value.problemNumber%5==0}">
							</tr>
							<tr>
						</s:if>
					</c:forEach>
				</tr>
			</table>
			<div style="page-break-before: always;">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberDivisionOutput.divisionProblems}"
						var="numberDivisionProblem">
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberDivisionProblem.value.problemNumber}" />)</span></td>
										<td align="right"><c:out
												value="${numberDivisionProblem.value.answer}" /></td>
						<s:if test="${numberDivisionProblem.value.problemNumber%6==0}">
							</tr>
							<tr>
						</s:if>
					</c:forEach>
				</tr>
			</table>
			
			</form:form>
	</div>
</body>
</html>