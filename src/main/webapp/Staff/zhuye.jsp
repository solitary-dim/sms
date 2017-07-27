<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人帐号主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/staff_1.css">
	<script src="js/staff_1.js"></script>

  </head>
  
  <body>
  	<!-- center style="font-size:32px;">Home</center-->
  	<div id="g1" onmouseover="chuxian();" onmouseout="xiaoshi();">
		<div class="but_z" id="but_z">
			<div id="bz">
				<img id="ii1" onclick="yb();" onmousemove="ting();" onmouseout="ck();" style="opacity:0.8;width:80px; height:80px;" src="img/zuo.png" />
				<!-- img style="opacity:0;" width="40" height="40" src="img/zuo.png"></img-->
			</div>
		</div>
		<div id="g1_1">
			<img class="show" src="img/z1.jpg"></img>
			<img class="show" src="img/z2.jpg"></img>
			<img class="show" src="img/z3.jpg"></img>
			<img class="show" src="img/z4.jpg"></img>
			<img class="show" src="img/z5.jpg"></img>
			<img class="show" src="img/z6.jpg"></img>
		</div>
		<div class="but_y" id="but_y">
			<div id="by">
							<!--img style="opacity:0;" width="40" height="40" src="img/zuo.png"></img-->
				<img id="ii2" onclick="zb();" onmousemove="ting();" onmouseout="ck();" style="opacity:0.8;width:80px; height:80px;" src="img/you.png" />
			</div>
		</div>
	</div >
	<div>
		<div class="zy_tex1">Links：</div>
		<div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.baidu.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/baidulogo1.jpg" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.sohu.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/souhu.jpg" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.sina.com.cn/" target="blank">
					<img style="width:100px;height:55px;" src="img/xinlang.jpg" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.qq.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/tx.gif" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.163.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/wy.png" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="https://www.taobao.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/tb.jpg" />
					</a>
				</div>
			</div>
			<div class="ljw">
				<div class="ljl">
					<a href="http://www.ganji.com/" target="blank">
					<img style="width:100px;height:55px;" src="img/gj.png" />
					</a>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
