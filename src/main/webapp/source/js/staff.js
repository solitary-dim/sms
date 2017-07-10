//标题跳转
function zhuye(){
	document.getElementById("ma").src="Staff/zhuye.jsp";
}

function grxx(){
	document.getElementById("ma").src="ShowEmByIdServlet";
}

function xggrxx(){
	document.getElementById("ma").src="ShowEByIdServlet";
}

function xgmm(){
	document.getElementById("ma").src="Staff/xgmm.jsp";
}

function yjpg(){
	document.getElementById("ma").src="ShowRoByIdServlet2?sel=28";
}
function task(){
	document.getElementById("ma").src="SelectTaskServlet";
}

function ygyj(){
	var perf=document.rpform.rper.value;
	if(perf.length<=0 || perf>100 || perf<=0){
		alert("Wrong Input!");
		return false;
	}else{
		document.formyj.action="UpdateEmServlet2?sel=30";
	    document.formyj.submit();
	}
}



