//! 브라우저의 스크롤 수치조작
//! scrollTop(); scrollLeft();
//! scrollTop(새로운 값); scrollLeft(새로운 값);

//? offset을 사용하면 위치값을 찾을 수 있다?

$(function(){
                    //! 메소드이기 때문에 offset>>()<<하기
    let topNum=$("h1").offset().top; //? h1이 떨어진 거리를 할 수 있다
    console.log(topNum); // 2000
    //* 프로그램은 위에서 아래로 y축의 + 아래에서 위로 y축의 -

    // 스크롤바 자체는 윈도우에게 있다 == 브라우저 자체가 가지고 있음
    $(window).scrollTop(topNum); // 스크롤이 2000만큼 당겨진다
    let sct=$(window).scrollTop();
    console.log(sct);
    //^ 스크롤의 위치값을 읽어서 동적으로 운영할 수 있다

    $(window).scroll(function(){
       let sct=$(window).scrollTop();
        console.log(sct); 

        if(sct <=2000){
            $("body").css({"background":"navy"});
        }else if(sct>2000 && sct<=3000){
            $("body").css({"background":"black"})
        }else{
            $("body").css({"background":"gray"})
        }
    });

});