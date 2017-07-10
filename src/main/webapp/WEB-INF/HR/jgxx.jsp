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
    
    <title>My JSP 'jgxx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/hr_1.css">
	<script src="js/hr.js"></script>
	

  </head>
  
  <body>
  <center style="font-size:32px;">ReporterInfor</center><br><br>
  	<form>
  	<table  class="bordered" style="width:800;"  border="1" cellspacing="0" align="center">

  		<tr style="60px;">
			<td class="gh">Job Number</td>
			<td class="xm">Name</td>
			<td class="xb">Sex</td>
			<td class="nn">Age</td>
			<td class="lxfs">MobilePho</td>
			<td class="yjpg">Performance Level</td>
			<td class="sj">Transfer</td>
			<td class="xq"></td>
		</tr>
		
		<c:if test="${!empty rlist }" var="flag">
    	<c:forEach items="${rlist }" var="ro" varStatus="s" begin="0" end="7">
		<tr style="40px;">
			<td>${ro.rno }</td>
			<td>${ro.rname }</td>
			<td>${ro.rsex }</td>
			<td>${ro.rage }</td>
			<td>${ro.rmobileno }</td>
			<td>${ro.rperformance }</td>
			<td style="font-size:12px;" onclick="jiangzhi(${ro.rid })"><img style="width:30px;height:30px;vertical-align:bottom;" src="img/xia.png" />Demotion</td>
			<td><a href="${pageContext.request.contextPath }/ShowRoByIdServlet2?sel=32&rid=${ro.rid }">Details </a></td>
		</tr>
		</c:forEach>
    	</c:if>

  	</table>
  </form>
  </body>
</html>
