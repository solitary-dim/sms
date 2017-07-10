//标题跳转
function zhuye(){
	document.getElementById("ma3").src="Staff/zhuye.jsp";
}

function grxx(){
	document.getElementById("ma3").src="HR/grxx.jsp";
}

function xggrxx(){
	document.getElementById("ma3").src="HR/xggrxx.jsp";
}

function xgmm(){
	document.getElementById("ma3").src="HR/xgmm.jsp";
}

function ckjgxx(){
	document.getElementById("ma3").src="ShowRoServlet?sel=11";
}

function xgjgxx(){
	var rid=document.getElementById("roid").value;
	document.formtw.action="UpdateRoServlet2?sel=23&rid="+rid;
	document.formtw.submit();
}

function ckygxx(){
	document.getElementById("ma3").src="ShowEmServlet?sel=9";
}

function xgygxx(){
	document.getElementById("ma3").src="Reporter/xgygxx.jsp";
}

function ckyjpg(){
	document.getElementById("ma3").src="HR/ckyjpg.jsp";
}

function yjpg(){
	document.getElementById("ma3").src="ShowEmServlet?sel=24";
}

function hrygxx1(){
	var select=document.getElementById("selec");
	var index=select.selectedIndex;
	var sele=select.options[index].value;
	document.forme.action="ShowEmByIdServlet2?sel=16&sele="+sele;
	document.forme.submit();
}

function hrjgxx1(){
	var select=document.getElementById("sele");
	var index=select.selectedIndex;
	var sele=select.options[index].value;
	document.formt.action="ShowRoByIdServlet2?sel=12&sele="+sele;
	document.formt.submit();
}

function valipass(){
	var opwd=document.getElementById("holdpwd").value;
	var npwd=document.getElementById("hnewpwd").value;
	var npwd2=document.getElementById("hnewpwd2").value;
	if(npwd==null || npwd.length==0){
		alert("请填入新密码！");
		return false;
	}
	if(npwd2==null || npwd2.length==0){
		alert("请再次确认新密码！");
		return false;
	}
	if(npwd!=npwd2){
		alert("两次输入密码不一致！");
		return false;
	}else{
		if(npwd==opwd){
			alert("新密码不能和旧密码一样！");
			return false;
		}else{
			document.form9.action="UpdateHpwdServlet";
			document.form9.submit();
			alert("密码修改成功！请重新登录！");
		}
	}
	
}

function shengzhi(obj){
	var eid=obj;
	window.location.href="UpdateEmServlet2?sel=20&eid="+eid;
}

function jiangzhi(obj){
	var rid=obj;
	window.location.href="UpdateEmServlet2?sel=18&rid="+rid;
}

function pandin2(){
	//var username=document.getElementById("username").value;
	var username=document.hrform.username.value;
	var mobileno=document.hrform.mobileno.value;
	var email=document.hrform.e_mail.value;
	if(username==null || username==""){
		alert("Please Input Information!");
		return false;
	}else{
		if(mobileno==null || mobileno==""){
			alert("Please Input Information!");
			return false;
		}else{
			if(email==null || email==""){
				alert("Please Input Information!");
				return false;
			}else{
				document.hrform.action="UpdateHrById";
				document.hrform.submit();
			}
		}
	}
}