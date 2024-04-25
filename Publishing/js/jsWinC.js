// ? inputType text를 의미 객체가 가지고 있는 속성을 사용할 떄는 .객체 를 사용 
// ? 본인을 열게 해준 원인(?) 을 opener라고 함
document.getElementById("childValue").value= window.opener.document.getElementById("parentValue").value;
// & 부모가 가지고 있는 값을 자식이 가지게 된다

function sendVal(){
    window.opener.document.getElementById("parentValue").value=document.getElementById("childValue").value;
    window.close();
}


