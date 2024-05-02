$(function(){
    //! width(), heigth();  ...
    //! width("새로운값"), heigth("새로운값");
    let w1=$("#p1").height();
    console.log(w1); //50

    let w2=$("#p1").innerHeight();
    //? innerHight=> paading
    console.log(w2); //90

    let w3=$("#p1").outerHeight(); // border값도 포함
    console.log(w3); // 100

    $("#p2").outerWidth(100).outerHeight(100);

    // ~요소의 위치조작~
    //! position() :  상대 위치값
    //! offset().[left,top] : 절대 위치값

    //* form- val /텍스트- text
    let $txt1=$(".txt_1 span"),
        $txt2=$(".txt_2 span"),
        $box=$(".box");
    let off_t = $box.offset().top; //?  100  브라우저기준
    let pos_t = $box.position().top; //? 50  부모기준, 현재 자신기준

    $txt1.text(off_t);
    $txt1.text(pos_t);
});
