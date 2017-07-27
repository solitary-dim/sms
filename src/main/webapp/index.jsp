<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Login page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <link href="css/Log.css" rel="stylesheet" />
  <script src="js/login.js"></script>
  <body>
  <div class="log_bg"><div class="jiyiji"></div>
  	<div class="log_body">
  		<!-- >div class="log_img1">
  			<img width="300" height="300" src="img/log_img1.jpg" />
  		</div-->
  		<div class="log_1">
  			<form action="" method="post" name="rform">
    			<!--  >span style="font-size:24px;">&nbsp;用户登录|Login</span--><br><br><br><br><br><br><br>
    			<center>username：&nbsp;&nbsp;<input name="eusername" type="text" size=20 /></center><br>
    			<center>password：&nbsp;&nbsp;<input name="epwd" type="password" size=20 /></center>
    			<center style="font-size:12px;line-height:1.4;"><br><br>
    				<input type="radio" name="Authority" value="1" checked/>Staff
    				<input type="radio" name="Authority" value="2" />Reporting Officer
    				<input type="radio" name="Authority" value="3" />HR
    			</center>
    			<center style="line-height:0.4;"><br>
    				<!-- input type="button" onclick="ps();" value="登录"  /-->&nbsp;&nbsp;
    				<button type="button" class="green button" onclick="ps();">Login</button>
    				&nbsp;&nbsp;
    				<button type="button" class="green button" onclick="exit()">Exit</button>
    			</center>
    		</form>
		</div>
    </div>
    </div>
  </body>
</html>
