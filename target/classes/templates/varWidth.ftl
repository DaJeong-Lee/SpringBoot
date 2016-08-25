<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
html body{
	width:100%;	
	height:100%;
	padding:0;
	margin:0;
}

.left{
	background-color:blue;
	float:left;
	height:100%;
	width:200px;
}
.right{
	background-color:green;
	float:left;
	height:100%;
	width:calc(100% - 200px);
}
</style>
</head>
<body>
	<div class="container">
		<div class="left"></div>
		<div class="right">
			<div style="width:100%;float:right;text-align:right;">abcdefg</div>
		</div>
	</div>
</body>
</html>