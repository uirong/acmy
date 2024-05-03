$(function(){
    $('#rel_site').on('change',function(){
        $('.txt').text($(this).val()); //? this: change를 발생시킴 ==event를 발생시키고있는 주체
                            // 선택된 값의 val값을 가져온다
    });
});

$(function(){
    //! <a> <form> 링크속성 제거와 클릭 이벤트 적용하기
    //! <a href=""> <form action="#">
    //^ return false;
    //^ e.preventDefault();

    // 하나는 링크속성 하나는 버튼처럼
    $(".btn1").on("click",function(e){
        e.preventDefault(); //! e.preventDefault() 사용시 매개변수를 사용해야한다
        $(".txt1").css({"background":"navy"});
    });
    $(".btn2").on("click",function(){
        $(".txt2").css({"background":"brown"});
        return false;
    });
});