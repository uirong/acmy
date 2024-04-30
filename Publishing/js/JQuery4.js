$(function(){

    //! contains( ) :  해당요소에 해당문자가 포함되어 있는다면 선택
    $("#inner_1 p:contains(내용1)").css("background","purple");

    //! contents( ) :  해당요소의 하위요소(1 (dept) 텍스트와 태그노드를 선택
    $("#outer_wrap").contents().css({"border":"1px solid #00f"});

    //! has( )      :  해당요소가 지정한 태그를 포함하면 선택
    $("#inner_1 p:has(strong)").css("background","skyblue");

    //! not( )      :  지정한 요소를 제외한 나머지 선택
    $("#inner_2 p").not(":first").css({"background ": "navy"}) //? inner2의 첫번째를 나머지
             
    //! end( )      :  필터링 되기 이 전의 선택자. 코드상에서 필러링 되기 직전
    $("#inner_2 p").eq(2).end().css("color","yellow") //? eq(2)번째 필터링을 하고 있다 eq는 필터링. 지정한 요소 선택


    //! find()      :  하위요소 요소 중에 필터링 할 요소
    $("#Inner_1").find(".txt1").css("background","red");

    //! filter()    :  선택한 요소 중에 필터링 할 요소
    $("#Inner_1 p").filter(".txt2").css("color","green");  // p태그중에 txt로 되어있는거를 선택

    $("#Inner_2 p").filter(function(idx,obj){ //? 다수의 p태그들이 있을때 인덱스 번호를 배열로 가져옴  
        // inner_2에 p가 가득있으면 스크립트는 이를 index번호로 가져오게 된다
        console.log(idx);
        return idx%2==0; // idx의 배열중에 짝수인 애만 꺼내오겠다
    }).css({"background-color":"pink"}); //? 0은 짝수 취급 / 필터링 할때는 콜백함수를 사용해서 좀 더 디테일하게 사용가능하다.

});