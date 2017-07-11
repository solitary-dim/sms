<%--
  Created by IntelliJ IDEA.
  User: solitary.wang
  Date: 2017/7/11
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/source/css/login.css"/> " rel="stylesheet"/>
    <script src="<c:url value="/source/js/login.js"/> "></script>
</head>
<body>

<div class="log_bg">
    <div class="jiyiji"></div>
    <div class="log_body">
        <!-- >div class="log_img1">
            <img width="300" height="300" src="img/log_img1.jpg" />
        </div-->
        <div class="log_1">
            <form action="" method="post" name="rform">
                <!--  >span style="font-size:24px;">&nbsp;用户登录|Login</span--><br><br><br><br><br><br><br>
                <center>username&nbsp;&nbsp;<input name="eusername" type="text" size=20/></center>
                <br>
                <center>password&nbsp;&nbsp;<input name="epwd" type="password" size=20/></center>
                <center style="font-size:12px;line-height:1.4;"><br><br>
                    <input type="radio" name="Authority" value="1" checked/>Staff
                    <input type="radio" name="Authority" value="2"/>Reporting Officer
                    <input type="radio" name="Authority" value="3"/>HR
                </center>
                <center style="line-height:0.4;"><br>
                    <!-- input type="button" onclick="ps();" value="登录"  /-->&nbsp;&nbsp;
                    <button type="button" class="green button" onclick="login();">Login</button>
                    &nbsp;&nbsp;
                    <button type="button" class="green button" onclick="exit()">Exit</button>
                </center>
            </form>
        </div>
    </div>
</div>

</body>
</html>
