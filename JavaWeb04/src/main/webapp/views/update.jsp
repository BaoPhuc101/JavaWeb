<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<form action="/JavaWeb04/update" method="post">
	<label for="fullname"><b>Full Name</b></label>
			<input type="text" placeholder="Enter Fullname" name="fullname" required> <br>
	<label for="phone"><b>Phone</b></label> 
			<input type="text" placeholder="Enter Phone" name="phone" required> <br>
	<label for="images"><b>Images</b></label> 
			<input type="text" placeholder="Enter Images" name="images" required> <br>
	<button type="submit"> Enter </button>
	</form>
</body>
</html>