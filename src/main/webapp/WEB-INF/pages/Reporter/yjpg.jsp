<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Performance Appraisal</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/reporter_1.css">

  </head>
    <script src="js/reporter.js"></script>
  
  <body>
  	<div>
  	<form action="" method="post" name="formth" onSubmit="return yjpgu();">
  	 StaffNumber：
  	 <select id="sel1">
     	<c:if test="${!empty elist1 }" var="flag">
    	<c:forEach items="${elist1 }" var="employee" varStatus="s">
    	<option value="${employee.eid}">${employee.eno}</option>
		</c:forEach>
    	</c:if>
     	</select>&nbsp;
     	 
    	<input type="submit" value="Submit"/><br><br>
  	</form>
    </div>
    	<iframe id="yjpg2" src="Reporter/yjpg1.jsp" frameBorder="0" width="1000" height="750" scrolling="no">
    	</iframe>
 				
  </body>
</html>
