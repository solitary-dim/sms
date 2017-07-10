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
  <body>
   <center style="font-size:32px;">PersonalInfor</center><br><br>
	<form class="grxx">
		<table  class="bordered" style="width:800px" height="240"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="20%">&nbsp;&nbsp;UserName</td>
				<td width="30%">&nbsp;&nbsp;${hr.husername}</td>
				<td width="20%">&nbsp;&nbsp;Name</td>
				<td width="30%">&nbsp;&nbsp;${hr.hname}</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Age</td>
				<td width="30%">&nbsp;&nbsp;${hr.hage}</td>
				<td width="20%">&nbsp;&nbsp;Sex</td>
				<td width="30%">&nbsp;&nbsp;${hr.hsex}</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Job Number</td>
				<td width="30%">&nbsp;&nbsp;${hr.hno}</td>
				<td width="20%">&nbsp;&nbsp;MobilePho</td>
				<td width="30%">&nbsp;&nbsp;${hr.hmobileno}</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;E-mail</td>
				<td width="70%" colspan="3"  style="text-align:left;">&nbsp;&nbsp;${hr.hemail }</td>
			</tr>
		
	
			
		</table>
	</form>
  </body>
</html>
