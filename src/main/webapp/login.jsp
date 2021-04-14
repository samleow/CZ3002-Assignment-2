<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Login page -->
<html>
	<body>
		<h2>Login</h2>
		<!-- Used to display error message -->
		<p>
			<s:property value="message" />
		</p>
		<!-- Performs login action on submit -->
		<s:form action="login">
			<!-- Input field for username -->
			<s:textfield name="user.username" label="Username" />
			<!-- Input field for password -->
			<s:password name="user.password" label="Password" />
			<s:submit />
		</s:form>
	</body>
</html>
