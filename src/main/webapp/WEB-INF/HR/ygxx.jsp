<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xgxx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/hr_1.css">


  </head>
  	<script src="js/hr.js"></script>
  <body>
  <center style="font-size:32px;">StaffInfor</center><br><br>
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
		
		<c:if test="${!empty elist }" var="flag">
    	<c:forEach items="${elist }" var="employee" varStatus="s" begin="0" end="7">
		<tr style="40px;">
			<td>${employee.eno }</td>
			<td>${employee.ename }</td>
			<td>${employee.esex }</td>
			<td>${employee.eage }<input type="hidden" name="ygxxg" value="${employee.eid}"/></td>
			<td>${employee.emobileno }</td>
			<td>${employee.performance }</td>
			<td style="font-size:12px;" onclick="shengzhi(${employee.eid});"><img style="width:30px;height:30px;vertical-align:middle;" src="img/shang.png" />升职</td>
			<td><a href="${pageContext.request.contextPath }/ShowEmByIdServlet2?sel=10&eid=${employee.eid }">Details</a></td>
		</tr>
		</c:forEach>
    	</c:if>
  	</table>
  </form>
  </body>
</html>
