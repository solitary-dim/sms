<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改员工信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">
	<script src="js/reporter.js" type="text/javascript"></script>

  </head>
    	<style>
  .button{
	border-radius:4px;
}

@-webkit-keyframes redPulse {
	  from { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #e33100; -webkit-box-shadow: 0 0 18px #e33100; }
	  to { background-color: #bc330d; -webkit-box-shadow: 0 0 9px #333; }
	}
.red.button { -webkit-animation-name: redPulse; -webkit-animation-duration: 1s; }
a.button {
		-webkit-animation-duration: 2s;
		-webkit-animation-iteration-count: infinite; 
	}
button,.button {
		float:left;
	    border-style: solid;
	    border-width: 0;
	    cursor: pointer;
	    font-family: inherit;
	    font-weight: bold;
	    line-height: normal;
	    position: relative;
	    text-decoration: none;
	    text-align: center;
	    display: inline-block;
	    padding-top: 0.4em;
	    padding-right: 1.5em;
	    padding-bottom: 0.4em;
	    padding-left: 1.5em;
	    font-size: 0.4em;
	    background-color: #2daebf;
	    border-color: #238896;
	    color: white
	}</style>
  <body>
  
  	<center style="font-size:32px;">EditStaff</center><br>
    	<form name="form4" action="" method="post" onSubmit="return xgygxx2();" >
		<table class="bordered" width="800" height="500"  border="1" cellspacing="0" align="center">
			<tr>
				<td width="25%">UserName</td>
				<td width="75%"><input type="text" name="eusername" value="${employee.eusername }"></td>
			</tr>
			<tr>
				<td width="25%">Name</td>
				<td width="75%"><input type="text" name="ename" value="${employee.ename }"></td>
			</tr>
			<tr>
				<td width="25%">Age</td>
				<td width="75%"><input type="text" name="eage" value="${employee.eage }"></td>
			</tr>
			<tr>
				<td width="25%">Sex</td>
				<td width="75%"><input type="text" name="esex" value="${employee.esex }"></td>
			</tr>
			<tr>
				<td width="25%">Job Number</td>
				<td width="75%"><input type="text" name="eno" value="${employee.eno }"></td>
			</tr>
			<tr>
				<td width="25%">MobilePho</td>
				<td width="75%"><input type="text" name="emobileno" value="${employee.emobileno }"></td>
			</tr>
			<tr>
				<td width="25%">E-mail</td>
				<td width="75%"><input type="text" name="eemail" value="${employee.eemail }"></td>
			</tr>
			<tr>
				<td width="25%">Skills</td>
				<td width="75%"><input type="text" name="eskills" value="${employee.eskills }"></td>
			</tr>
			<tr>
				<td width="25%">Team</td>
				<td width="75%"><input type="text" name="eteam" value="${employee.eteam }"></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<input class="red button" type="submit"  value="Edit">
				<input type="hidden" id="eid" value="${employee.eid }"/>
				</td>
			</tr>
			
		</table>
	</form>
  </body>
</html>
