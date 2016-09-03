<html>
<head>
<meta charset="UTF-8">
<title>Hello ${name}!</title>
<link rel="stylesheet" href="/css/jquery-ui.min.css">
<script src="/js/jquery-3.1.0.min.js"></script>
<script src="/js/jquery-ui.min.js"></script>
<script>
$(function(){
	$('#dialog').dialog({
		autoOpen: false,
		modal: true, 
		show:{effect: 'blind', duration: 1000},
		hide:{effect: 'explode', duration: 1000},
	});
	
	$('#opener').click(function(){
		$('#dialog').dialog('open');
	});
	
});
</script>
</head>
<body>
	<div id="dialog" title="다이얼로그">
		<p>다이얼로그 입니다.</p>
	</div>
	
	<button id="opener">다이얼로그 열기</button>
</body>
</html>