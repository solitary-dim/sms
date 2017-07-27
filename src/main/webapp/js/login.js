var a;

function danxuan(){
var obj = document.getElementsByTagName("input");
    for(var i=0; i<obj.length; i ++){
        if(obj[i].checked){
            a=obj[i].value;
        }
    }
}

function log(){
	danxuan();
	if(a==1){
		document.rform.action="EmLoginServlet";
		document.rform.submit();
	}else if(a==2){
		document.rform.action="RoLoginServlet";
		document.rform.submit();
	}else if(a==3){
		document.rform.action="HrLoginServlet";
		document.rform.submit();
	}else{
		alert("未选择登录方式！");
	}
	
}

function userName(username1){

	if(username1.length!=0){
		return true;
	}else{
		alert("用户名不能为空！");
		return false;
	}
}
function passWord(password1){

	if(password1.length!=0){
		return true;
//		if(password1.length<6){
//			alert("密码不能小于六位数！");
//			return false;
//		}else{
//			return true;
//		}
	}else{
		alert("密码不能为空！");
		return false;
	}
	
}
function ps(){

	var str1=document.rform.eusername.value;
	var str2=document.rform.epwd.value;
	if(userName(str1) && passWord(str2)){

		log();
	}
}

function exit(){
	self.opener=null;
	self.close();
	window.opener=null;
	window.open("",'_top');
	window.close()
}