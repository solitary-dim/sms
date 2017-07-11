<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Staff information page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <link href="css/staff.css" rel="stylesheet" />
  <script src="js/staff.js"></script>
  <body>
  	<div class="s_body">
  		<div class="main">
  			<div class="head_1">
  				<div class="head_left">Feng Yun Company<div class="logo"><img width="120" height="80" src="img/logo.png" /></div></div>
  				<div class="head_right">
  					Welcome：${employee.ename }
  					<a href="../../index.jsp">Exit</a>
  				</div>
  			</div>
  			<div class="tab">
  				<a class="blue button" onclick="zhuye();">HOME</a><!-- div class="top" onclick="zhuye();">< input class="tab_1" type="button" value="主页"/></div-->
  				<a class="green button" onclick="grxx();">PersonalInfo</a><!--div class="top" onclick="grxx();">< input class="tab_1" type="button" value="个人信息"/></div-->
  				<a class="green button" onclick="xggrxx();">EditInfo</a><!--div class="top" onclick="xggrxx();"><input class="tab_1" type="button" value="修改个人信息"/></div-->
  				<a class="green button" onclick="xgmm();">EditPwd</a><!--div class="top" onclick="xgmm();"><input class="tab_1" type="button" value="修改密码"/></div-->
  				<a class="green button" onclick="yjpg();">&nbsp;GPA&nbsp;</a><!--div class="top" onclick="yjpg();"><input class="tab_1" type="button" value="业绩评估"/></div-->
  				<a class="green button" onclick="task();">Task</a>
 	 		</div><br>
 	 		<img src="img/xian.jpg" /><br><br>
 	 		<iframe id="ma" src="Staff/zhuye.jsp" frameBorder="0" width="1000" height="650" scrolling="no"></iframe>
  		</div>
  		<div class="s_foot"><center style="font-size: 12px;">
			@copyRight
</center></div>
  	</div>
  </body>
</html>
