//! 객체조작
//! 속성조작
//! html(),html(요소명) : 태그를 포함한 텍스트까지를 범위로 하는 함수
// 가로만 쓰면 값을 읽어오는 것

$(function(){
    let result1=$("#sec_1").html();
    console.log(result1);

    //* \" 하면 "를 글자취급
    //! html 코드와는 관계없이 태그의 텍스트 부분을 원하는데로 변경
    $("#sec_1 p").html("<a href=\"#\">uirong</a>");

    //! text(),text("텍스트") : 태그의 텍스트 부분만 범위로 하는 함수(하위)
    let result2=$("#sec_2").text();
    console.log(result2);
    $("#sec_2 h2").text("duviyeon");

    //* 객체를 실시간으로 화면상에서 변경 할 수 있다
});

//! 태그의 속성 조작
//! attr("속성명"); attr("속성명","새로운값"); removeAttr("속성명");
$(function(){
    let srcVal=("#sec-1 img").padStart("src");
    console.log(srcVal);

    //? src를 변경하는것
    //? html에 작성된 모든건 다 문자이다              srcVal를 replace하겠다 a에서 b로 변경해주세요
    $("#sec-1 img").attr({"width":200,"src":srcVal.replace("_1.jpeg,_2.jpeg"),"alt":"바위"
}).removeAttr("border");
    ;
})