$(function(){
    //! 단독이벤트
    /*
    $("선택자").이벤트(function)(){
    }; */

    // ! 그룹이벤트
    /*
    $("선택자").on(이벤트종류1, 이번트종류2, 이벤트종류n ,function(){}); // 이벤트가발생 되었을 때
    $("선택자").on({이벤트종류1, 이번트종류2, 이벤트종류n:function(){
    }}); */

    $(".btn1").click(function(){
        $(".btn1").parent().next().css({"color" :  "red"}); // 동위태그 다음의태그 현제 
    });
    $(".btn3").click(function(){
        $(".btn1").parent().next().css({"color" :  "black"}); // 동위태그 다음의태그 현제 
    });


    // * focus: 마우스가 집중되어있는 상태 blur: 포커스에서 벗어나는 것
    $(".btn2").on({
        "mouseover focus":function(){
            $(".btn2").parent().next().css("color","blue");
        },
        "mouseout blur":function(){
            $(".btn2").parent().next().css("color","black");
        }
    });
    //! off() : 이벤트 제거
    $(".btn1").off("click"); //? 이벤트 동결시키기
});


$(function(){
    $(".BTN1").on({
        "mouseover":function(){
            $(".txt1").css({"background":"navy"});
            // $(".txt1").css("color","white");
        },
        "mouseout":function(){
            $(".txt1").css({"background" : "none"});
            // $(".txt1").css("color","black");
        }
    });


    //! hover-> mouseover + mouseout
    //! 그룹이벤트가 필요할 경우... blur/focus 기능이 필요할 경우 hover사용 지양하기
    $(".BTN2").hover(
        function(){ //^ => mouseover
            $(".txt2").css("background","blue");
            // $(".txt2").css("color","white");
        },
        function(){ //^ => mouseout
            $(".txt2").css("background","none");
            // $(".txt2").css("color","black");
        }
    );
});


$(function(){
                                    //? 운영체제에서 발생하는 event를 받아온다
    $(document).on("mousemove",function(e){ //? 스크립트에 있는 내장객체들은 "" 하면 안된다
        //? 마우스 포인터는 x값 y값을 갖고있다
        // e.pageX e.pageY
        $(".posX").text(e.pageX); //? text : 변경하고 싶을때
        $(".posY").text(e.pageY);
    });
});