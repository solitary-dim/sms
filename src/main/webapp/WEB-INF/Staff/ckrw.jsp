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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  	<link href="css/staff_1.css" rel="stylesheet">
  <body>
  	<center style="font-size:32px;">Viewing Task</center><br><br>
  	<div style="width:800px;margin:0 auto;font-size:18px;">&nbsp;&nbsp;
  		<table class="bordered" style="width:800px;" border="1" cellspacing="0" align="center">
  		<tr height="80">
  		<td width="30%" style="text-align:center;"><b>Publisher</b></td>
  		<td width="70%" style="text-align:center;"><b>Tasks</b></td>
  		</tr>
  		<c:if test="${!empty list }" var="flag">
    	<c:forEach items="${list }" var="list" varStatus="s">
    	<tr height="60">
    	<td width="30%" align="center">
    	${list.publisher }
    	</td>
    	<td width="70%" align="center">
    	${list.task}
		</td>
    	</tr>
    	</c:forEach>
    	</c:if>
  		</table>
  	</div>
  </body>
</html>
