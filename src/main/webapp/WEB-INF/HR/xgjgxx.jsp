<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'grxx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
	<link rel="stylesheet" type="text/css" href="css/hr_1.css">
	<script src="js/hr.js"></script>
  
  <body>
	<center style="font-size:32px;">EditReporter</center><br><br>
	<form name="formtw" action="" method="post" onSubmit="return xgjgxx();">
		<table class="bordered" style="width:800; height:500;"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="25%">UserName</td>
				<td width="75%"><input type="text" name="rusername" value="${ro.rusername }"></td>
			</tr>
			<tr>
				<td width="25%">Name</td>
				<td width="75%"><input type="text" name="rname" value="${ro.rname }"></td>
			</tr>
			<tr>
				<td width="25%">Age</td>
				<td width="75%"><input type="text" name="rage" value="${ro.rage }"></td>
			</tr>
			<tr>
				<td width="25%">Sex</td>
				<td width="75%"><input type="text" name="rsex" value="${ro.rsex }"></td>
			</tr>
			<tr>
				<td width="25%">Job Number</td>
				<td width="75%"><input type="text" name="rno" value="${ro.rno }"></td>
			</tr>
			<tr>
				<td width="25%">MobilePho</td>
				<td width="75%"><input type="text" name="rmobileno" value="${ro.rmobileno }"></td>
			</tr>
			<tr>
				<td width="25%">E-mail</td>
				<td width="75%"><input type="text" name="remail" value="${ro.remail }"></td>
			</tr>
			<tr>
				<td width="25%">Team</td>
				<td width="75%"><input type="text" name="rteam" value="${ro.rteam }"></td>
			</tr>
			<tr>
				<td width="25%">Department</td>
				<td width="75%"><input type="text" name="rcompany" value="${ro.rcompany }"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"  value="Edit">
				<input type="hidden" id="roid" value="${ro.rid}"/>
				</td>
			</tr>
			
		</table>
	</form>
  </body>
</html>
