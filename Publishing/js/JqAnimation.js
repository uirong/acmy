$(function(){
    //! animation() : 움직임 구현
    //^ animate({스타일 속성},적용시간,가속도,콜백함수)

    $(".btn1").on("click",function(){
        $(".txt1").animate({
            marginLeft:"500px",
            fontSize:"30px"
        },2000,function(){
            alert("모션완료!");
        });
    });

    $(".btn2").on("click",function(){
        $(".txt2").animate({
            marginLeft:"+=50px" //? 누를 때마다 증가 해야하기 때문에 += 사용 
        });
    });
});



    //! stop(); : 현재 실행중인 애니메이트를 종료
    //! stop(true,true); : 현재 실행중인 애니메이트를 종료 후 >>대기열에있는 다음 애니메이션을 바로 실행한다<<
                        //! 대기열을 삭재
    //! delay() : 일정시간 큐에서 대기 후 실행
    //! queue() : 함수를 사용해서 애니메이트 효과구현, 나미지 대기열 삭제
    //! clearQueue() :  진행중인 것 제외하고 대기열에 정보 모두 삭제
    //! dequeue() : queue() 이후에 대기열의 정보를 정상적으로 실행 시킨다
$(function(){
    $(".text1").animate({
        marginLeft: "300px"
    },1000)
    $(".text2").delay(3000).animate({
        marginLeft:"300px"
    },1000);

    $(".BTN1").on("click",moveElement);

    function moveElement(){
        $(".text3").animate({ //? 애니메이션이 적용된 상태로 움직임
            marginLeft:"+=50px"
        },800);

        $(".text4").animate({
            marginLeft:"+=50px"
        },800);
        $(".text4").stop(); //? 현재 진행중인 애니메이션을 즉시 중지한다

        $(".text5").animate({ //? 애니메이션이 적용X 상태로 움직임
            marginLeft:"+=50px"
        },800);
        $(".text5").stop(true,true);
    }

    


});