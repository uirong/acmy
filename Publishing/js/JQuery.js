// 자바스크립트 이용시
/*
window.onload=function(){ // ? 현재 페이지가 모두 로딩되기 전까지 대기
    let pTag=document.getElementById(p1);   
    pTag.style.color="red"; JS에서의 css 설정
}

$("document").ready(function(){
     잘 사용 안함
});
*/ 
//! 기본문법
$(function(){

    // $("선택자").기능();  
    // $('#title').css("color","red"); //? let pTag=document.getElementById(p1);  이거랑 같은 역할
    $("*").css("color","blue");
    $(".tit").css("color","gray");
    $("h3").css("color","green");
    $("h1,h2").css("color","purple");
    $("h2.tit").css("color","navy");


    //! parent(), parents(): 부모'들', parents(div): >>부모 중에서 div만<< 고른다
    //! next(),prev(),closet();
    //! nextAll():동생의 전부, prevAll():형의 전부 .siblings(): 나빼고 형제전부 다
    $("div div h2").next().css("color","brown");
    // $("div div h2").parent().css("border","1px solid #000");
    $("#inner_wrap h1").css("color","yellow");
    $("#inner_wrap>p").css("color","skyblue");

    $(".txt").siblings().css("color","pink"); 
    //? 나 빼고 >>모든 형제들<<, 그냥 나 빼고 다 형제를 상속하고 싶을때 사용
    // $(".txt").parents().css("border","1px double #ff0000")


    $(".txt1").closest("div").css("border","1px solid #000");
});


//! 인접 선택자
// a는 c의 상위(closest)
// b는 c의 부모(parent)
// c는 b의 자식(childeren)
// d는 e의 형(prev)
// f는 e의 동생(next)