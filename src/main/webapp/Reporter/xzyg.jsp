<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xzyg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">
	<script src="js/reporter.js" type="text/javascript"></script>

  </head>
  
  <body>
       <center style="font-size:32px;">AddStaff</center><br><br>
       	<form class="grxx" name="form6" method="post" action="" onSubmit="return xzyg2();">
		<table class="bordered" width="800" height="380"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="20%">&nbsp;&nbsp;Name</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="ename"></td>
				<td width="20%">&nbsp;&nbsp;UserName</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="eusername"></td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Age</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="eage"></td>
				<td width="20%">&nbsp;&nbsp;Sex</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="esex"></td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Job Number</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="eno"></td>
				<td width="20%">&nbsp;&nbsp;MobilePho</td>
				<td width="30%">&nbsp;&nbsp;<input type="text" name="emobileno"></td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;E-mail</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;<input type="text" name="eemail"></td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Skills</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;<input type="text" name="eskills"></td>
			</tr>
			<tr>
				<td width="20%">&nbsp;&nbsp;Department</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;<input type="text" name="eteam"></td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="70%" colspan="3">&nbsp;&nbsp;<input type="submit" value="Add"></td>
			</tr>			
		</table>
	</form>
  </body>
</html>
