<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎使用</title>
<style>
	*{
		padding: 0;
		margin: 0;
	}
	body{
	margin-top:100px;
	}

	#submit{
		width:300px;
		height:300px;
		font-size:100px;
		margin-left:40%;
		color:white;
		background: blue;
	}
</style>
</head>
<body>
	<form action="Selectservlet" method="post">
		<input  type="submit" value="开始" id="submit"/>
	</form>
</body>
</html>