<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	<form action="/JavaWeb04/register" method="post">
		<h2>Tạo tài khoản mới</h2>
		<c:if test="${alert != null}">
			<h3 class="alert alert danger">${alert}</h3>
		</c:if>
		<section>
			<div class="container">
				<input type="text" placeholder="Tài khoản" name="username"
					class="form-control"> <input type="text"
					placeholder="Mật khẩu" name="password" class="form-control">
				<input type="text" placeholder="Email" name="email"
					class="form-control"> <input type="text"
					placeholder="Tên đầy đủ" name="fullname" class="form-control">
				<input type="text" placeholder="SĐT" name="phone"
					class="form-control">
				<button type="submit">Login</button>
			</div>
		</section>
	</form>
</body>
</html>