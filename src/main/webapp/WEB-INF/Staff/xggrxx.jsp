<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改个人信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	<link rel="stylesheet" type="text/css" href="css/staff_1.css">
	<script src="js/staff_1.js"></script>
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
  <center style="font-size:32px;">EditPersonal</center><br><br>
  <form action="" method="post"	name="rform" onSubmit="return pandin1();">
  	<table class="bordered" width="800" height="300"  border="1" cellspacing="0" align="center">
  		<tr>
			<td width="25%">&nbsp;&nbsp;UserName</td>
			<td width="75%">&nbsp;&nbsp;<input name="eusername" id="username" type="text" value="${em.eusername }" /></td>
		</tr>
  		<tr>
			<td width="25%">&nbsp;&nbsp;MobilePho</td>
			<td width="75%">&nbsp;&nbsp;<input name="emobileno" id="mobileno" type="text" value="${em.emobileno }" /></td>
		</tr>
  		<tr>
			<td width="25%">&nbsp;&nbsp;E-mail</td>
			<td width="75%">&nbsp;&nbsp;<input name="eemail" id="e_mail" type="text" value="${em.eemail }" /></td>
		</tr>
  		<tr>
			<td width="25%">&nbsp;&nbsp;Skills</td>
			<td width="75%">&nbsp;&nbsp;<input name="eskills" id="skills" type="text" value="${em.eskills }" /></td>
		</tr>

  		<tr>
  			<td width="25%"></td>
  			<td width="75%">&nbsp;&nbsp;<input class="red button" type="submit" value="Edit" /></td>
  		</tr>
  	</table>
  </form>
  </body>
</html>
