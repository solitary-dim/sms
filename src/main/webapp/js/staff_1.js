//主页滚动广告
var a;
var b;
var c;
var d=0;
var e;
var f=0;
var m;

window.onload=function()
{
	e=window.setInterval("zb()",4000);
	xiaoshi();
}

function ting(){
	clearInterval(e);
}

function ck(){
	e=window.setInterval("zb()",4000);
}

function zb(){
if(f!=0) return;
c=document.getElementById("g1");
if(c.scrollLeft==4000)
	{m=1;}
a=c.scrollLeft;
b=setInterval(zbz,10);
}

function zbz(){
if(c.scrollLeft==(a+1000)){
	clearInterval(b);
	f=0;
	if(m==1){
		c.scrollLeft=0;
		m=0;
	}
}else{
	c.scrollLeft+=20;
	f+=1;
}
}

function yb(){
if(f!=0) return;
c=document.getElementById("g1");
if(c.scrollLeft==1000)
	{m=2;}
a=c.scrollLeft;
b=setInterval(yby,10);
}

function yby(){
if(c.scrollLeft==(a-1000)){
	clearInterval(b);
	f=0;
	if(m==2){
		c.scrollLeft=5000;
		m=0;
	}
}else{
	c.scrollLeft-=20;
	f+=1;
}
}
//左右按钮
function xiaoshi(){
	document.getElementById("ii1").style.width=0;
	document.getElementById("ii2").style.width=0;
}
function chuxian(){
	document.getElementById("ii1").style.width=80;	
	document.getElementById("ii2").style.width=80;	
}
//个人信息表格

function valipass(){
	var opwd=document.getElementById("oldpwd").value;
	var npwd=document.getElementById("newpwd").value;
	var npwd2=document.getElementById("newpwd2").value;
	
	if(npwd==null || npwd.length==0){
		alert("请填入新密码！");
		return false;
	}
	if(npwd2==null || npwd2.lenght==0){
		alert("请再次确认新密码！");
		return false;
	}
	if(npwd!=npwd2){
		alert("两次输入密码不一致！");
	}else{
		if(npwd==opwd){
			alert("新密码不能和旧密码一样！");
		}else{
			document.iform.action="UpdateEpwdServlet";
			document.iform.submit();
			alert("密码修改成功！请重新登录！");
		}
	}
	
}

//(pandin1)
function pandin1(){
	var eusername=document.rform.eusername.value;
	var emobileno=document.rform.emobileno.value;
	var eemail=document.rform.eemail.value;
	var eskills=document.rform.eskills.value;
	if(eusername==null){
		alert("Please Input Information!");
		return false;
	}else{
		if(emobileno==null){
			alert("Please Input Information!");
			return false;
		}else{
			if(eemail==null){
				alert("Please Input Information!");
				return false;
			}else{
				if(eskills==null){
					alert("Please Input Information!");
					return false;
				}else{
					document.rform.action="UpdateEmServlet";
					document.rform.submit();
				}
			}
		}
	}
	
}
