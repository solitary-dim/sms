<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>监管详细信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">



  </head>
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
	<link rel="stylesheet" type="text/css" href="css/hr_1.css">
  <body>
	<center style="font-size:32px;">Details</center><br><br>
	<form class="grxx">
		<table  class="bordered" width="800" height="380"  border="1" cellspacing="0" align="center">
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
				<td width="20%">&nbsp;&nbsp;Skills</td>
				<td width="70%" colspan="3">&nbsp;&nbsp;${ro.rname }</td>
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
	<a class="blues button" style="left:-280px;" href="${pageContext.request.contextPath }/ShowRoByIdServlet2?sel=22&rid=${ro.rid }">Edit</a><a class="blues button" style="left:-130px;" href="HR/jgxx.jsp">Return</a>
  </body>
</html>
