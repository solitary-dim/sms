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
    
    <title>查看员工信息页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <SCRIPT src="js/reporter.js"></SCRIPT>
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
  <div  style="height:38px;">
  	
  	<form name="form5" action="" method="post" onSubmit="return ygxxxq();">
       	  		StaffNumber：
       	 	<select id="sel">
     	 
     		<c:if test="${!empty elist }" var="flag">
    		<c:forEach items="${elist }" var="employee" varStatus="s">
    		<option value="${employee.eid}">${employee.eno}</option>
			</c:forEach>
    		</c:if>
     	</select>&nbsp;&nbsp;&nbsp;&nbsp;
     	
     	<input style="left:370px;" class="red button" type="submit" value="Search"/>
     	<input style="left:385px;" class="red button" type="button" onclick="xzyg();" value="AddStaff"/>
     	<br><br>
  	</form>
  </div>
     	<iframe name="zhiye" id="ygxxxq" src="Reporter/ygxx.jsp" frameBorder="0" width="1000" height="650" scrolling="no"></iframe>
  
  </body>
</html>
