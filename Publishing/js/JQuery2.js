//! 탐색 선택자 >> :사용
$(function(){
    $("#menu li:first").css("color","red");
    $("#menu li:last").css("color","red");
    $("#menu li:even").css("color","blue"); //! 홀짝의 기준이 index번호 
    $("#menu li:odd").css("color","green"); //? 짝수

    //! eq(): index 번호를 지정한다
    $("#menu li").eq(2).css("color","orange"); 
    //! lt(): index ()보다 위에있는 ~자신은 포함하지 않음
    $("#menu li:lt(2)").css("color","navy");
    //! gt(): index ()보다 밑에있는 ~자신은 포함하지 않음
    $("#menu li:gt(2)").css("color","purple");


    $("#menu1 li:nth-child(1)").css("color","pink"); // ? index 번호가 아니라 작성순서를 따른다
    $("#menu1 li:nth-child(2n)").css("color","yellow"); //? 짝수번째 
    $("#menu2 li:nth-last-child(1)").css("color","gray");


    //! 배열관련 메소드 (읽기, 효율성UP)
    //! each, foreach -> Return X
    //! map           -> Return O   반복문이긴 하지만 결과를 새로운 배열로 만든다
    //! index() : 요소의 인덱스번호
    let obj=[
        {"area":"서울"},
        {"area":"부산"},
        {"area":"인천"}
    ];
    // each함수는 어떤 배열의 값을 앞에서 index번호 뒤에서 object로 받아서 할 수 있다
    $(obj).each(function(i,o){ // 변수이름은 상관 없다 앞의 배열은 인덱스 번호여야한다
        console.log(i + ":", o); // o:배열의 값, 실제 오브젝트 i: index
    });

    // $.$each($("#menu2 li"),function(i,o){
    //     console.log(i + ":"+o);
    // });

    obj.forEach(function(value,index,array){ // obj : 객체
        console.log(`Value: ${value}, Index : ${index}, array : ${array}`);
    });


    let arr1=[{
        "area":"인천",
        "name":"신현"
    },{
        "area":"서울",
        "name":"홍과장"
    },{
        "area":"대전",
        "name":"박사장"
    },{
        "area":"인천",
        "name":"김의연"
    }];


    let arr2= $.map(arr1,function(a,b){ //? a가 배열의 값을 받는다. b가 index / 한번 돌때 한번씩 가져온다
                                // a안에 arr1의 0번째...1번째..2번째 값을 차례대로 넣는다 )for문과 같음
                                // 기존배열을 건드리지 않고 변형된 형태의 데이터를 이용해서 새로 배열을 만든다
        if(a.area == '인천'){ //? 서울일때만 객체를 반환한다
            return a; 
        };
    });
    console.log(arr1);
    console.log(arr2);


    // ! index

    let index=$("li").index($("#list3"));
    console.log(index);


});



