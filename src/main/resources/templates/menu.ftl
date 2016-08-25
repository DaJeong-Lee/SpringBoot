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

a{
	text-decoration:none;
}
a:hover{
	text-decoration:underline;
}

ul#nav li{
	float:left;
	list-style:none; /* 블릿제거 */
	margin-right: 0.5em; /* Place some space between the adjacent top nav items. */ 
	background-color: #DDD; /* Add a background color to all nav items. */
	padding: 0 0.25em; /* Place a little space around nav item text. */
}

ul#nav li li{
	float:none;
	margin-left: -44px; /* Account for missing bullet space, etc. */
  	margin-top: 3px; /* Place some space between the vertical dropdown menu items. */ 
}

ul#nav ul{
	display:none; /* hide */
	position:absolute; /* sub메뉴 위치 고정 */
}

ul#nav li:hover ul{
	display:block;  /* show */
}

ul#nav{
	margin-left: -41px; /* Account for missing bullet space, etc. */
}

ul#navWrapper li li:first-child { 
  margin-top: 4px; /* Add a touch more space between a top nav item and its associated drop-down menu. */
}

</style>
</head>
<body>
	<ul id="nav">
		<li><a>MenuA</a>
			<ul>
				<li>Sub1
				<li>Sub2
				<li>Sub3
			</ul>
		<li><a>MenuB</a>
			<ul>
				<li>Sub1
				<li>Sub2
			</ul>
		<li><a>MenuC</a>
			<ul>
				<li>Sub1
				<li>Sub2
				<li>Sub3
				<li>Sub4
			</ul>
	</ul>
</body>
</html>