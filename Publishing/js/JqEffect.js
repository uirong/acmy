//! 효과
//! hide(); fadeOut(); slideUp(); -> 숨김
//! show(); fadeIn(); slideDown(); -> 노출
//! toggle(); fadeToggle(); slideToggle(); fadeTo(0~1);

//! 효과시간
//! 1. slow, normal, fast
//! 2. 1000 단위 (밀리세컨즈 ms)
//* 3. $(요소선택).효과메소드(효과시간, 가속도, [콜백함수(선택)]);



$(function(){
    $(".btn2").hide();
    $(".btn1").on("click",() =>{
        $('.box').slideUp(1000,"linear",function(){ // 1초동안 슬라이드 업 한뒤에 할 일이 있으면 콜백함수
            $(".bnt1").hide();
            $(".btn2").show();
        });
    });

    $(".btn2").on("click",()=>{
        $(".box").fadeIn(1000,"swing",function(){
            $(".btn2").hide();
            $(".btn1").show();
        });
    });

    $(".btn3").on("click",function(){
        $(".box").slideToggle(1000,"linear");
    });

    $(".btn4").on("click",function(){
        $(".box").fadeTo("fast",0.3);
    });

    $(".btn5").on("click",function(){
        $(".box").fadeTo("fast",1);
    });
});