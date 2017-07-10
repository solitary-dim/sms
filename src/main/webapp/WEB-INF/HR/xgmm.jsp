<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>"> 
    <script type="text/javascript" src="js/hr.js"></script>
  </head>
	<link rel="stylesheet" type="text/css" href="css/hr_1.css">
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
  	<form method="post" action="" name="form9" onSubmit="return valipass();">
  		<table  class="bordered" width="800" height="240"  border="1" cellspacing="0" align="center">
  			<tr>
  				<td width="25%">&nbsp;&nbsp;Input Oldpwd：</td>
  				<td width="75%" style="text-align:left;">&nbsp;&nbsp;<input type="password" size="40" id="holdpwd" value="${hr.hpwd}" readonly="readonly"></td>
  			</tr>
  			<tr>
  				<td width="25%">&nbsp;&nbsp;InputNewpwd：</td>
  				<td width="75%" style="text-align:left;">&nbsp;&nbsp;<input type="password" size="40" id="hnewpwd"></td>
  			</tr>
  			<tr>
  				<td width="25%">&nbsp;&nbsp;Ensure Newpwd：</td>
  				<td width="75%" style="text-align:left;">&nbsp;&nbsp;<input type="password" size="40" name="newpwd" id="hnewpwd2"></td>
  			</tr>
  			<tr>
  				<td></td><td style="text-align:left;">&nbsp;&nbsp;<input class="red button" type="submit" value="Edit" /></td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
