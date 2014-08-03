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
	width: 100%;
	padding: 0;
	padding-top: 10px;
	border: 0px;
	text-align: left;
}

#tableBold {
	font-family: sans-serif,serif;
	font-size: 14px;
	font-weight: 14px;
	letter-spacing: 2px;
	border: thin;
}
</style>
</head>
<body>
	<div id="centered">
		<h3 id="centered">Number Multiplication Problems</h3>
		<form:form method="POST">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberMultiplicationOutput.multiplicationProblems}" var="numberMultiplicationProblem">
						<td>
							<table border=0>
									<tr >
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberMultiplicationProblem.value.problemNumber}" />)</span></td>
										<td align="right"><c:out value="${numberMultiplicationProblem.value.formatMultiplicationNumber}" /></td>
									</tr>
									<tr>
									    <td></td>			
										<td align="right">x<c:out value="${numberMultiplicationProblem.value.formatMultiplier}" /></td>
										
									</tr>
								<tr>
									<td colspan=2 align="center">---------------<br></td>
								</tr>
								<tr>
									<td colspan=2 align="center">---------------<br></td>
								</tr>
								<tr>
									<td colspan=2 align="center">---------------<br></td>
								</tr>
																								<tr>
									<td colspan=2 align="center">---------------<br></td>
								</tr>
								<tr>
									<td colspan=2 align="center">---------------</td>
								</tr>
							</table>
						</td>
						<s:if test="${numberMultiplicationProblem.value.problemNumber%5==0}">
							</tr>
							<tr>
						</s:if>
					</c:forEach>
				</tr>
			</table>
			<div style="page-break-before: always;">
			<table id="tableBold">
				<tr>
					<c:forEach items="${numberMultiplicationOutput.multiplicationProblems}"
						var="numberMultiplicationProblem">
										<td align="right" style="margin-right: 2px; border-collapse: collapse;"><span style="font-size: x-small;">(<c:out
												value="${numberMultiplicationProblem.value.problemNumber}" />)</span></td>
										<td align="right"><c:out
												value="${numberMultiplicationProblem.value.answer}" /></td>
						<s:if test="${numberMultiplicationProblem.value.problemNumber%5==0}">
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