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
  </head>
   <link href="css/Log.css" rel="stylesheet" />
  
  <body class="log_body">
  <h2>The user name or password mistake, Please <a href="${pageContext.request.contextPath}/index.jsp">Login Again</a>！</h2>
  </body>
</html>
