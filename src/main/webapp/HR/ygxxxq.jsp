<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ygxxxq.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	

  </head>
  	<link rel="stylesheet" type="text/css" href="css/hr_1.css">
  	<script src="js/hr_1.js"></script>
  	<style>.button{
	border-radius:4px;
}
@-webkit-keyframes bluePulse {
	  from { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }
	  50% { background-color: #2daebf; -webkit-box-shadow: 0 0 18px #2daebf; }
	  to { background-color: #007d9a; -webkit-box-shadow: 0 0 9px #333; }
	}
.blues.button { 
	-webkit-animation-name: bluePulse; 
	-webkit-animation-duration: 2s; 
	}
a.button {
		-webkit-animation-duration: 2s;
		-webkit-animation-iteration-count: infinite; 
	}
button,.button {
		float:right;
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
	    padding-top: 0.75em;
	    padding-right: 1.5em;
	    padding-bottom: 0.8125em;
	    padding-left: 1.5em;
	    font-size: 0.5em;
	    background-color: #2daebf;
	    border-color: #238896;
	    color: white
	}</style>
  <body>
  <center style="font-size:32px;">Details</center> <br><br>
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
	<a class="blues button" style="left:-200px;" href="HR/ygxx.jsp">Return</a>
  </body>
</html>
