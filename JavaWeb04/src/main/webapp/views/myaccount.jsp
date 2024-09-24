<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>
</head>
<body>
	<b>Fullname:</b> ${fullname}
	<br>
	<b>Phone:</b> ${phone}
	<br>
	<b>Images:</b> ${images}
	<form action="/JavaWeb04/multipartServlet" enctype="multipart/form-data" method="post">
	<input type="file" name="multipartServlet" /> <input type="submit" value="Upload Images" />
		<a href="/JavaWeb04/home">HOME</a> <br>
		<a href="/JavaWeb04/update">CẬP NHẬT THÔNG TIN</a>
	</form>
</body>
</html>