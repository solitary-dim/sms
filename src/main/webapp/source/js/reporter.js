function zhuye(){
	document.getElementById("rep").src="Staff/zhuye.jsp";
}

function grxx(){
	document.getElementById("rep").src="ShowRoByIdServlet";
}

function xggrxx(){
	document.getElementById("rep").src="ShowRByIdServlet";
}

function xggrxx2(){
	document.form2.action="UpdateRoServlet";
	document.form2.submit();
}

function ygxx(){
	document.getElementById("rep").src="ShowEmServlet?sel=2";
}

function xgygxx(){
	document.getElementById("rep").src="ShowEmServlet?sel=3";
}
function task(){
	document.getElementById("rep").src="Reporter/fbrw.jsp";
}

function xgmm(){
	document.getElementById("rep").src="Reporter/xgmm.jsp";
}

function yjpg(){
	document.getElementById("rep").src="ShowEmByIdServlet2?sel=25";
	//document.getElementById("rep").src="ShowEmServlet?sel=24";
}
//
//function yjpgu(){
//	var select=document.getElementById("sel1");
//	var index=select.selectedIndex;
//	var sele=select.options[index].value;
//	document.form5.action="ShowEmByIdServlet2?sel=25&sele="+sele;
//	document.form5.submit();
//}

function xgygxx2(){
	var eid=document.getElementById("eid").value;
	document.form4.action="UpdateEmServlet2?sel=7&eid="+eid;
	document.form4.submit();
	//document.form4.action="UpdateEmServlet?sel=6"
	
}

function xgygxx3(){
	var select=document.getElementById("sel");
	var index=select.selectedIndex;
	var sele=select.options[index].value;
	document.form3.action="ShowEmByIdServlet2?sel=4&sele="+sele;
	document.form3.submit();
}

function ygxxxq(){
	var select=document.getElementById("sel");
	var index=select.selectedIndex;
	var sele=select.options[index].value;
	document.form5.action="ShowEmByIdServlet2?sel=6&sele="+sele;
	document.form5.submit();
	//document.getElementById("ygxxxq").src="ShowEmByIdServlet2?sel=6&sele="+sele;
}

function valipass(){
	var opwd=document.getElementById("oldpwd").value;
	var npwd=document.getElementById("newpwd").value;
	var npwd2=document.getElementById("newpwd2").value;
	
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
	}else{
		if(npwd==opwd){
			alert("新密码不能和旧密码一样！");
		}else{
			document.form1.action="UpdateRpwdServlet";
			document.form1.submit();
			alert("密码修改成功！请重新登录！");
		}
	}
	
}

function xzyg(){
	document.getElementById("ygxxxq").src="Reporter/xzyg.jsp";
}

function xzyg2(){
	var ename=document.form6.ename.value;
	var eusername=document.form6.eusername.value;
	var eage=document.form6.eage.value;
	var esex=document.form6.esex.value;
	var eno=document.form6.eno.value;
	var emobileno=document.form6.emobileno.value;
	var eemail=document.form6.eemail.value;
	var eskills=document.form6.eskills.value;
	var eteam=document.form6.eteam.value;
	if(ename==null || ename==""){
		alert("Please Input Information!");
		return false;
	}else{
		if(eusername==null || eusername==""){
			alert("Please Input Information!");
			return false;
		}else{
			if(eage==null || eage==""){
				alert("Please Input Information!");
				return false;
			}else{
				if(eage<=0){
					alert("Wrong Input!");
					return false;
				}else{
					if(esex==null || esex==""){
						alert("Please Input Information!");
						return false;
					}else{
						if(eno==null || eno==""){
							alert("Please Input Information!");
							return false;
						}else{
							if(emobileno==null || emobileno==""){
								alert("Please Input Information!");
								return false;
							}else{
								if(eemail==null || eemail==""){
									alert("Please Input Information!");
									return false;
								}else{
									if(eskills==null || eskills==""){
										alert("Please Input Information!");
										return false;
									}else{
										if(eteam==null || eteam==""){
											alert("Please Input Information!");
											return false;
										}else{
											document.form6.action="UpdateEmServlet2?sel=8";
											document.form1.submit();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

function yjpg3(obj){
	var n=obj;
	var eid=document.getElementsByName("eids")[n].value;
	var perfs=document.getElementsByName("perf")[n].value;
	if(perfs.length<=0 || perfs>100 || perfs<=0){
		alert("Wrong Input!");
		return false;
	}else{
		document.formyj.action="UpdateEmServlet2?sel=26&performance="+perfs+"&eid="+eid;
	    document.formyj.submit();
	}
}


/*
function yjpg3(){
	var num=document.getElementsByName('nu[]');
	var eid,perfs;
	for(var n=0;n<num.length;n++){
		var per=new Array();
		per[n]=document.getElementsByName("perf")[n].value;
		if(per[n]!=null || per[n]!="" || per[n].length!=0){
			perfs=per[n];
			var ei=document.getElementsByName("eids")[n].value;
			eid=ei;
			alert(n);
			alert("sdf")
//			alert(eid);
//			alert(perfs);
		}
	}
//	var ei=document.getElementsByName('eids[]');
//	var eid;
//	for(var j=0;j<ei.length;j++){
//		if(ei[j].value!='' || ei[j].value!=null){
//			eid=ei[j].value;
//		}else{
//			alert("value is null!");
//		}
//	}
//    var per = document.getElementsByName('perf[]');
//    var perfs;
//    for(var i=0; i<per.length; i++){
//       	if(per[i].value!='' || per[i].value!=null){
//       		perfs=per[i].value;
//       	}else{
//       		alert("value is null!");
//       	}
//            	
////                if(per[i].value==''){
////                    alert('Value is null.');
////                    return false;
////                }else{
////                	var perfs=per[i];
//////                	document.formyj.action="UpdateEmServlet2?sel=26&performance="+perfs;
//////					document.formyj.submit();
////                }
//    }
//    alert(eid);
//    alert(perfs);
//            document.formyj.action="UpdateEmServlet2?sel=26&performance="+perfs+"&eid="+eid;
//            document.formyj.submit();
}
*/
