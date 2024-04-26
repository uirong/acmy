//! getElementById()            << many use
//! querySelector()   ㅡ 배열형식
//! getElementByClassName()
//! querySelectorAll  ㅡ 배열형식  << many use

/*
let ptag=document.getElementById("p1"); // ptag에 대한 정보(대상이 업는상태)가 없으니까 오류가 발생한다
ptag.innerHTML="반갑습니다" // 그렇기 때문에 p 태그 뒤에 script를 둔다
//* 아이디속성값은 전체 페이지에서 유니크하게 사용하기 위해 사용한다(속성의 값은 유니크하다)
//* id: 스크립트를 객체화 하기 위해 사용한다
//* class속성은 디자인 적용을 위해 사용한다 ...여러 태그에 걸쳐 똑같은 표현을 할 수 있다
window.onload = function(){
    //? body가 실행 되기까지 기다려라 = window.onload  => 콜백 함수

    // let ptag = document.getElementById("p1");
    // ptag.innerHTML = "반갑습니다";

    let ptag2 = document.querySelector("#p2");
    ptag2.innerHTML = "이이수순시이인"

    let ptag3 = document.getElementsByClassName("p3")[1]; //! !배열형식이라 [0]넣어야한다
    // ptag3[1].innerHTML = "아카데미";
    ptag3.innerHTML = "아카데미"; // span의 코리아2 부분이 아카데미가 된다
}

*/
let htag=document.getElementsByClassName('myclass')
// console.log(htag);
setTimeout(() => { // ? 자바스크립트에서 css 적용하는 방법
    htag[0].style.color="red";  // ! Object.style.속성 = 값
}, 3000);
// setTimeout(() => { // ? 자바스크립트에서 css 적용하는 방법
//     htag[0].style.backgroundColor="green";  // ! Object.style.속성 = 값
// }, 3000);

window.onload=function(){
    // let section = document.querySelector("#sections.section");
    // section.style.border= "1px solid #ff0000"   

/*
    let sections=document.querySelectorAll("#sections, #sections. section")
    sections.style.border="1px solid #ff0000";
*/

    let test = document.querySelectorAll(".test");
    for(let i=0;i<test.length;i++){
        test[i].innerHTML=i; // 배열형태로 오기
    }
}

