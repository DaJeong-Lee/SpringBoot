<html>
<head>
<meta charset="UTF-8">
<title>Hello ${name}!</title>
<style>
html body{
	width:100%;	
	height:50px;
	padding:0;
	margin:0;
}
div, ul, li { margin:0; padding:0; }

/* 블릿기호 제거 */
ul{
	list-style: none;
}
.menu>ul{
	float:left;	
}
.menu ul li{
	float:none;
	display:none;
}

/* ul태그에 mouse over 했을 경우  */
.menu ul:hover li{ 
	display:block;
}

</style>
<script src="js/jquery-3.1.0.min.js"></script>
<script>
	
</script>
</head>
<body>
	<div class="menu" style="width:100%;height:100%;">
		<ul><a href="#">menu1</a>
			<li>sub1
			<li>sub2
			<li>sub3
		</ul>
		<ul><a href="#">menu2</a>
			<li>sub1
			<li>sub2
		</ul>
		<ul><a href="#">menu3</a>
			<li>sub1
			<li>sub2
			<li>sub3
			<li>sub4
		</ul>
    </div>
</body>
</html>