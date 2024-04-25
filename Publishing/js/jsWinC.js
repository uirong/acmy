// ? inputType text를 의미 객체가 가지고 있는 속성을 사용할 떄는 .객체 를 사용 
// ? 본인을 열게 해준 원인(?) 을 opener라고 함

 //부모 -> 자식
 document.getElementById("childvalue").value = window.opener.document.getElementById("parenValue").value;
 // 객체 형태로 가져올 수 있음
 //getElementById("childvalue") = input 태그
 //value 속성으로 태그의 정보를 가져온다 -> 값을 삽입
 // 객체의 형태를 속성으로 사용할 대는 .속성 형식으로 가져와야한다

// & 부모가 가지고 있는 값을 자식이 가지게 된다

function sendVal() {
    window.opener.document.getElementById("parenValue").value = document.getElementById("childvalue").value;
    window.close();
}


