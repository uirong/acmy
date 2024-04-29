//! event 2가지 형식
//! 1) 인라인 정의 방식
//! 2) 내부정의 방식 ( 파일만 빼면됨 )


window.addEventListener('DOMContentLoaded',function(){
    let btn=this.document.getElementById("target");
    btn.addEventListener("click",function(event){  //? 조건이 맞으면 click되는 방식
    // this.alert("Hello Wolrd "+ btn.value ); // 여러개가 있으면 구분이 안된다
    //^ 매개변수를 만들고 이벤트를 발생시키는 쪽에서 event가 실행되는 값을 받는다
    alert("Hello Wolrd "+ event.target.value ); //? event target : 이벤트를 발생시키는 대상을 의미
    //? event.target : 현재 event를 발생시키는 시점에 그 버튼을 클릭한 대상만 버튼정보(+벨류값)를 가져오는 것
    });
    


});