<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Login</h2>
<s:form action="register" method="post">
      <s:textfield name="user.username" label="Username: " />
      <s:password name="user.passsword" label="Password: " />
      <s:submit/>
</s:form>	
</body>
</html>