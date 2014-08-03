<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon Corp</title>
</head>
<body>
<br><br><br>
<h2  align="center">Logon Corp</h2>
<br><br><br><br><br>
<form:form method="POST" action="/Demo/auth">
 
   <table align="center">
   
    <tr>
        <td><form:label path="userName">User Name</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password" /></td>
    </tr>
   
    <tr height="50">
        <td colspan="2" align="center">
            <input type="submit" value="Login"/>
        </td>
    </tr>
	</table>  
</form:form>
</body>
</html>