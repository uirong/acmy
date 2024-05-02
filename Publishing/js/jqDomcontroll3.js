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
});