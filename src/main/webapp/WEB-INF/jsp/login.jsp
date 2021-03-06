<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<jsp:include page="fragments/headTag.jsp"/>
<body>
	<h1>Login</h1>
	<form class="well" id="login" method="POST" action="<c:url value="/j_spring_security_check" />">
		<p>
			<label for="j_username">User name</label> 
			<input id="j_username" name="j_username" type="text" />
		</p>
		<p>
			<label for="j_password">Password</label> 
			<input id="j_password" name="j_password" type="password" />
		</p>
		<input class="btn btn-info" type="submit" value="Login" />
	</form>
</body>

</html>