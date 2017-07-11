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
    
    <title>员工信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">


  </head>
    <script src="js/reporter.js" type="text/javascript"></script>
    
  <body>

  <center style="font-size:32px;">Staff Information</center><br><br>
   
  <form action="" method="post">
  	<table  class="bordered" width="800"  border="1" cellspacing="0" align="center">

  		<tr style="height:60px;">
			<td class="gh">&nbsp;&nbsp;Job Number</td>
			<td class="xm">&nbsp;&nbsp;Name</td>
			<td class="nn">&nbsp;&nbsp;Age</td>
			<td class="xb">&nbsp;&nbsp;Sex</td>
			<td class="lxfs">&nbsp;&nbsp;MobilePho</td>
			<td class="yhm">&nbsp;&nbsp;Team</td>
			<td class="xq"></td>
		</tr>
		
		<c:if test="${!empty elist }" var="flag">
    	<c:forEach items="${elist }" var="employee" varStatus="s" begin="0" end="12">
    	<tr style="height:40px;">
			<td>${employee.eno }</td>
			<td>${employee.ename }</td>	
			<td>${employee.eage }</td>
			<td>${employee.esex }</td>
			<td>${employee.emobileno }</td>
			<td>${employee.eteam }</td>
			<td><a href="${pageContext.request.contextPath }/ShowEmByIdServlet2?sel=5&eid=${employee.eid }">Details</a></td>
		</tr>
		</c:forEach>
    	</c:if>

  	</table>
  </form>
  </body>
</html>
