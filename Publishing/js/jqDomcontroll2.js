$(function(){
    //! class 속성조작
    //! addClass("class 값"); removeClass("class값"); toggleClass("class") ->클래스가 있으면 빼고 없으면 넣는
    //! hasClass("class")
    $("#p1").addClass("aqua");
    $("#p2").removeClass("red");
    $("#p3").toggleClass("brown"); //? class가 없으면 추가하는 것
    $("#p4").toggleClass("green");
    $("#p6").text($("#p5").hasClass("purple")); //? hasClass: 해당 클래스에 있는지 없는지 판단해달라는 것 / 있으면 true 없으면 false
    $("#p6").text($("#p5").hasClass("green")); // yellow: 있으니까 true green: 없으니까 false
    // 기존값은 사라지고 true false값으로 보이게 된다
});

$(function(){
    //! 폼태그의 조작
    //! val(), val("새로운 값")
    //! prop() : true / false; 선택상자(selected), 체크빅스(checked), 라디오버튼(radio)
    //! prop("defalutValue");

    let result1=$("#user_name").val();
    console.log(result1);

    $("#user_id").val("javaScript"); //? 원래 value값이 js로 변경
    console.log("(#user_id).val"); //? 값만 받아와야하기 때문에 작성

    let result2=$("#user_id").prop("defaultValue");
    console.log(result2);

    // ~prop~
    let result3=$("#chk1").prop("checked"); //? chk1에 체크가 안되어있으므로 false
    console.log(result3);
    let result4=$("#chk2").prop("checked"); //? chk2에 체크가 되어 있으므로 true
    console.log(result4);

    // checked 동적으로 처리하는법
    let result5=$("#chk3").prop("checked",true); //? #chk3에 check 시킬 수 있다
    
    // Index number로 처리
    let result6=$("#se_1").prop("selectedIndex"); //! 부모 그룹을 지정하면 그 부모의 하위 요소들을 지저할 수 있다
                            //? 부모 하위들에 selected된 상태들 중에 있다면 >index번호<를 반환해주세요라는 뜻
    console.log(result6);
                    

});