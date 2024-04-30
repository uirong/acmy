$(function(){
    //! 속성선택자
    $("#wrap a[target]").css("background","red");
    $("#wrap a[href^=https]").css("background","brown");
    $("#wrap a[href$=net]").css("background","green");


    //! 속성의 상태탐색
    $("#wrap2 p:hidden").css({"display" : "block", "color" : "red"});

    let z1=$("#zone1 :selected").val();
    console.log(z1);

    let z2=$("#zone2 :checked").val();
    console.log(z2);

    //!! 타입의 속성값은 :을 붙인다 상태 속성자랑 헷갈리지 않는다
    $("#member_f :text").css("background","pink");
    $("#member_f :password").css("background","#ff6ddd");


});

