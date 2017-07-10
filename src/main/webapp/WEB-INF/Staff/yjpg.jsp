<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'yjpg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

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
	
	
  </head>
  	<link rel="stylesheet" type="text/css" href="css/staff_1.css">
	<script src="js/staff.js"></script>
  <body>
  	<center style="font-size:32px;">Performance Appraisal</center><br><br>
  	<form action="" method="post" name="rpform">
  		<table class="bordered" width="800"  border="1" cellspacing="0" align="center">
  			<tr style="height:40px;">
  				<td>Name</td>
  				<td>Job Number</td>
  				<td>Team</td>
  				<td>GPA(1-100)</td>
  				<td><input type="hidden" name="sel" value="30"/></td>
  			</tr>
  			<c:if test="${!empty rlist }" var="flag">
    	<c:forEach items="${rlist }" var="ro" varStatus="s">
    	<tr>
  				<td>${ro.rname}</td>
  				<td>${ro.rno}</td>
  				<td>${ro.rteam}</td>
  				<td><input name="rper" type="text"></td>
  				<td><input class="red button" type="submit" onclick="ygyj()" value="Submit"><input type="hidden" name="te" value="${ro.rteam }"></td>
  				</tr>
		</c:forEach>
    	</c:if>
  		</table>
  	</form>
  </body>
</html>
