<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>员工信息详情页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	

  </head>
  	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">
  	<script src="js/reporter.js"></script>
  <body>
  <center style="font-size:32px;">Details</center>
  <br><br>
	<form class="grxx">
		<table  class="bordered" width="800" height="380"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="20%">&nbsp;&nbsp;Name</td>
				<td width="30%">&nbsp;&nbsp;${employee.ename }</td>
				<td width="20%">&nbsp;&nbsp;UserName</td>
				<td width="30%">&nbsp;&nbsp;${employee.eusername }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Age</td>
				<td width="30%">&nbsp;&nbsp;${employee.eage }</td>
				<td width="20%">&nbsp;&nbsp;Sex</td>
				<td width="30%">&nbsp;&nbsp;${employee.esex }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Job Number</td>
				<td width="30%">&nbsp;&nbsp;${employee.eno }</td>
				<td width="20%">&nbsp;&nbsp;MobilePho</td>
				<td width="30%">&nbsp;&nbsp;${employee.emobileno }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;E-mail</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${employee.eemail }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Skills</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${employee.eskills }</td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Team</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${employee.eteam }</td>
			</tr>
	
			
		</table>
	</form>
	<a class="blue button" style="float:left; left:100px;" href="${pageContext.request.contextPath }/UpdateEmServlet2?sel=13&eid=${employee.eid}">Fire The Worker</a>
	<input type="hidden" id="deid" value="${employee.eid }"/>
	<a class="blue button" style="left:-92px;" href="Reporter/ygxx.jsp">Return</a>
	<a class="blue button" style="left:-100px;" href="Reporter/xgygxx2.jsp">Edit</a>
  </body>
</html>
