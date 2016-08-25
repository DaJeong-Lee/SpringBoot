<html>
<head>
<meta charset="UTF-8">
<title>Hello ${name}!</title>
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
	<div style="width:100%;height:100%;">
		<#include "menu.ftl">
	    <h2 style="clear:both;">Hello ${name}!</h2>
	    <img src="image/test.jpg"/>
    </div>
</body>
</html>