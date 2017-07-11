<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Feng Yun!</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <link href="css/reporter.css" rel="stylesheet" />
  <script src="js/reporter.js"></script>
  <body>
  	<div class="s_body">
  		<div class="main">
  			<div class="head_1">
  				<div class="head_left">Feng Yun Company<div class="logo"><img width="120" height="80" src="img/logo.png" /></div></div>
  				<div class="head_right">
  					Welcome！：${ro.rname }
  					<a href="../index.jsp">Exit</a>
  				</div>
  			</div>
  			<div class="tab">
  			<a class="blue button" onclick="zhuye();">HOME</a>
  			<a class="green button" onclick="grxx();">PersonalInfo</a>
  			<a class="green button" onclick="xggrxx();">EditPersonal</a>
  			<a class="green button" onclick="xgmm();">EditPwd</a>
  			<a class="green button" onclick="ygxx();">StaffInfo</a>
  			<a class="green button" onclick="xgygxx();">EditStaff</a>
  			<a class="green button" onclick="yjpg()">&nbsp;GPA&nbsp;</a>
  			<a class="green button" onclick="task();">Task</a>
 	 		</div><br>
 	 		<img src="img/xian.jpg" /><br><br>
 	 		<iframe id="rep" src="Staff/zhuye.jsp" frameBorder="0" width="1000" height="650" scrolling="no"></iframe>
  		</div>
  		
  		<div class="s_foot"><center style="font-size: 12px;">
			@copyRight
</center></div>
  	</div>
  </body>
</html>
