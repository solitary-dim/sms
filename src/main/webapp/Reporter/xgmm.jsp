<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">
	
	<script src="js/reporter.js"></script>


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
  <center style="font-size:32px;">EditPwd</center><br><br>
  <form name="form1" action="" method="post" onSubmit="return valipass();">
  	<table class="bordered" width="800" height="240"  border="1" cellspacing="0" align="center">

  		<tr>
			<td width="25%">&nbsp;&nbsp;OldPwd</td>
			<td width="75%">&nbsp;&nbsp;<input type="password" size="40" id="oldpwd" value="${rpwd1 }" readonly="readonly"/></td>
		</tr>
  		<tr>
			<td width="25%">&nbsp;&nbsp;Input Newpwd</td>
			<td width="75%">&nbsp;&nbsp;<input type="password" size="40" id="newpwd"/></td>
		</tr>
  		<tr>
			<td width="25%">&nbsp;&nbsp;Ensure NewPwd</td>
			<td width="75%">&nbsp;&nbsp;<input type="password" size="40" name="newpwd" id="newpwd2" /></td>
		</tr>


  		<tr>
  			<td width="25%"></td>
  			<td width="75%">&nbsp;&nbsp;<input class="red button" type="submit" value="Edit" /></td>
  		</tr>
  	</table>
  </form>
  </body>
</html>
