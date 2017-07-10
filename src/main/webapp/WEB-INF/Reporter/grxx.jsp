<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>监管个人信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">
  </head>

  <body>
    <center style="font-size:32px;">PersonalInfor</center><br><br>
	<form class="grxx">
		<table  class="bordered" width="800" height="320"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="20%">&nbsp;&nbsp;Name</td>
				<td width="30%">&nbsp;&nbsp;${ro.rname }</td>
				<td width="20%">&nbsp;&nbsp;UserName</td>
				<td width="30%">&nbsp;&nbsp;${ro.rusername }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Age</td>
				<td width="30%">&nbsp;&nbsp;${ro.rage }</td>
				<td width="20%">&nbsp;&nbsp;Sex</td>
				<td width="30%">&nbsp;&nbsp;${ro.rsex }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Job Number</td>
				<td width="30%">&nbsp;&nbsp;${ro.rno }</td>
				<td width="20%">&nbsp;&nbsp;MobilePho</td>
				<td width="30%">&nbsp;&nbsp;${ro.rmobileno }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;E-mail</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${ro.remail }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Team</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${ro.rteam }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Department</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${ro.rcompany }</td>
			</tr>
	
			
		</table>
	</form>
  </body>
</html>
