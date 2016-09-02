<html>
<head>
<meta charset="UTF-8">
<title>Hello !</title>
<style>
html body{
	width:100%;	
	height:100%;
	padding:0;
	margin:0;
}
</style>
</head>
<body>
	admin으로 로그인 하려면 여기서 로그인 함.
	( "/admin"요청인 경우만 이 page로 들어옴 ) 
	<form action="/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<button type="submit" class="btn">Log out</button>
	</form>
</body>
</html>