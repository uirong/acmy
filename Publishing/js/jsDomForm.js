function memChk(frm){ 
    // alert("memchk"); // 핸들러 함수 잘 실행 되는지 체크하는것 
    // format.table.tr.input.
    // document.memfrm.id.value ="김의연" // 홈태그에 있는 객체 형식을 사용할때 사용

    let checkOut=document.querySelectorAll('.chk:checked').length;
    //? 클래스가 .chk라고 된 상태가 checkbox에 checked한 상태만 가져온 개수를 가져온다
    //? 체크가 최소 1개 이상의 체크가 되어야하고 카운트가 1 이상부터 시작한다
    let checkGen=document.querySelectorAll('.chk:checked').length;

    
    // frm.id.value

    if(frm.id.value==""){
        alert("아이디를 입력하세요");
        frm.id.focus();
        return false;   
    }
    if(frm.pwd1.value==""){
        alert("비밀번호를 입력하세요");
        frm.pwd1.focus();
        return false;   
    }

    if(frm.pwd2.value==""){
        alert("비밀번호 확인을 입력하세요");
        frm.pwd2.focus();
        return false;   
    }
    if(frm.pwd1.value != frm.pwd2.value){
        alert("비밀번호가 일치하지 않습니다");
        frm.pwd2.focus();
        return false;
    }
    if(frm.email.value==""){
        alert("이메일을 입력하세요");
        frm.email.focus();
        return false;   
    }
    if(checkGen==0){
    // if(frm.gender.value==""){
        alert("성별을 입력하세요");
        return false;
    }
    if(frm.job.value==""){
        alert("직업을 입력하세요");
        return false;
    } 
    if(checkOut==0){
        alert("취미를 입력하세요");
        return false;
    }   
    if(frm.content.value==""){
        alert("가입인사를 입력하세요");
        return false;
    }
}

// $(document).ready(function(){
//     function memChk(){
//         $("input[name='id']").val("김의연");
//         if(value==""){
//             alert("아이디를 입력하세요");
//         }
//     }

//     memChk();
// });
