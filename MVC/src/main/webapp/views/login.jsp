<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
	<form action="/MVC/login" method="post">
		<c:if test="${alert != null}">
			<h3 class="alert alert-danger">${alert}</h3>
		</c:if>

		<div class="container">
			<br><label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname"><br>
			<br><label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw"><br>

			<br><button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label><br>
		</div>
		
		<br>
		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw"> <a href="/MVC/forget"> Forgot password?</a></span>
		</div>
		<br>
	</form>
</body>
</html>