<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="author" content="chengw">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my login page">

<link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css">
<link rel="icon" href="<%=basePath%>/assets/img/favicon.ico">
<!-- Bootstrap core CSS -->
<link href="<%=basePath%>assets/css/bootstrap.min.css" rel="stylesheet">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="<%=basePath%>assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="<%=basePath%>assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<input type="hidden" id="RootPro" value=<%=basePath%> />
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading"></h2>
			<label for="username" class="sr-only">用户</label> <input type="text"
				id="username"  name="username" class="form-control" placeholder="用户" required
				autofocus> <label for="password" class="sr-only">密码</label>
			<input type="password" id="password" name="password" class="form-control"
				placeholder="密码" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					记住密码
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" id="loginBtn" type="button">登录</button>
		</form>

	</div>
	<!-- /container -->

	<script type="text/javascript"
		src="<%=basePath%>js/jquery-1.10.4.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/md5.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="<%=basePath%>assets/js/ie10-viewport-bug-workaround.js"></script>
</body>

</html>

