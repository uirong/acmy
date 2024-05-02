//! 객체 요소 편집
//! 생성, 복제, 삭제 ...
//! before(); after(); append(); appendTo(); prepend(); prependTo();
//! insertBefore(); insertAfter(); remove();

$(function(){
    //? 앞에 제시된 이후에 위치되어있는 태그가 찍힌다
    $("#wrap p:eq(2)").after("<p>After</p>");               // 기준을 앞에 정의
    $("<p>insertAfter</p>").insertAfter("#wrap p:eq(1)");   // 기준을 뒤에 정의

    $("#wrap p:eq(1)").before("<p>Before</p>"); 
    $("<p>InsertBefore</p>").insertBefore("#wrap p:eq(0)");

    $("<li>appendTo</li>").appendTo("#listZone");   // 가장 마지막에 위치
    $("#listZone").prepend("<li>prepend</li>");     // 가장 앞쪽에 위치
});

$(function(){
    //! clone(); : 복제 /  remove(); : 삭제 (해당요소를 포함한 모두)
    //! empty(); : 삭제(해당요소의 하위 요소만 삭제)
    let copyObj=$('.box1').children().clone(); // box1의 p태그 정보를 그대로 얻는다
    $(".box2").remove(); //? div box2 까지 다 삭제

    $(".box3").empty(); //? box3의 하위요소만 삭제
    $(".box3").append(copyObj); //? 복제 정보를 가지고 있는 copyObj를 붙여준다
});
