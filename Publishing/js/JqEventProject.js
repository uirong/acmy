$(function(){
    let baseFontSize=14;
    $(".zoomBtnZone button").on("click",zoomInOut); //? 외부에 만들어진 함수는 함수의 이름만 사용한다
    // .zoomBtnZon의 하위인 button에 이벤트를 발생시키는 주체 == this
    $(".fonts").on("change",fontChange);
    $(".colors").on("change",colorChange);




    function zoomInOut(){ // 메소드 하나 만들기
        if($(this).hasClass("zoomOutBtn")){ // 현재 this가 클래스를 zoominWin1 이라는 뜻
            if(baseFontSize<=8){
                return false; // return값을 쓰면 함수는 멈추게 된다
            }
            baseFontSize--;

        }else if($(this).hasClass("ZoomInBtn")){
            if(baseFontSize>=20){
                return false;
            }
            baseFontSize++;
        }else{
            baseFontSize=14;
        };

        $('.fontSize').text(baseFontSize+"px"); //? 현재 폰트사이트 값을 문자열로 하기
        $("body").css({fontSize:baseFontSize+"px"})
    }



    let fontFamily;
    function fontChange(){
        if($(this).val() == "font1"){
            fontFamily = "궁서"   
        }else if($(this).val() == "font2"){
            alert("aaa")
            fontFamily = "바탕체"
        }else if($(this).val() == "font3"){
            fontFamily = "굴림체"
        }
        $("body #wrap").css({fontFamily:fontFamily});
        
   }



    // $("select option").on("click",function(){
        
    //     if($(this).focus()){
    //         $(".wrap").css("font-family","굴림");
    //     }else if($(this).focus()){
    //         $(".wrap").css("font-family","궁서");
    //     }else if($(this).focus()){
    //         $(".wrap").css("font-family","바탕");
    //     }
    //     $('.wrap').text()
    // });


    function colorChange(){
        // alert$($(this).val()); // 선택해서 색상을 정하고 그 색상을 코드값을 얻게 한다
        $("body #wrap").css({color:$(this).val()});
    }


});
