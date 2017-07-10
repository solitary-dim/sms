<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/staff_1.css">
	<script src="js.staff_1.js"></script>
	

  </head>

  <body>
  <center style="font-size:32px;">PersonalInfor</center><br><br>
	<form class="grxx">
		<table  class="bordered" style="width:800px" height="380"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="20%">&nbsp;&nbsp;Name</td>
				<td width="30%">&nbsp;&nbsp;${em.ename }</td>
				<td width="20%">&nbsp;&nbsp;UserName</td>
				<td width="30%">&nbsp;&nbsp;${em.eusername }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Age</td>
				<td width="30%">&nbsp;&nbsp;${em.eage }</td>
				<td width="20%">&nbsp;&nbsp;Sex</td>
				<td width="30%">&nbsp;&nbsp;${em.esex }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Job Number</td>
				<td width="30%">&nbsp;&nbsp;${em.eno }</td>
				<td width="20%">&nbsp;&nbsp;MobilePho</td>
				<td width="30%">&nbsp;&nbsp;${em.emobileno }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;E-mail</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${em.eemail }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Skills</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${em.eskills }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Team</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${em.eteam }</td>
			</tr>
	
			
		</table>
	</form>
  </body>
</html>
