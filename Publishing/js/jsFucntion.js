
// ! 함수 작성 형식
// ! 1. 명명 함수
// ! 2. 익명 함수
// ! 3. 명명 함수 : 원래 이름이 없는데 >>변수를 사용<<해서 이름이 생기는 것
// ! 4. 즉시 실행 함수
// ! 5. 화살표 함수

/*
function add(){
    document.write(2+3,"<br>");
}
add(); // add() 호출하기

function add2(x,y){
    document.write(x+y+"<br>");
}
add(2,4);


function add3(x,y){
    let sum = x+y;
    return sum;
    // document.write(x+y+"<br>");
}

document.write(add3(10,20)); // add3은 sum이 된다


function add4(x){
    if(x==10){
        return;
    }
    document.write(x);
}
*/

// * 익명함수

let anadd = function(){
    document.write("hello would"+"<br>");
} // ~ 익명함수에 이름을 지어주고 함수처럼 사용 할 수 있다
anadd(); // ! 익명함수 호이스팅 불가

/* 짝꿍꺼
// 익명함수 
let anadd = function(){
    document.write("hello")
}

//즉시실행함수
(function(){
    document.write("즉시실행 함수");
});
*/

// * 즉시실행함수
/*
(function(){
    document.write("즉시실행 함수");
 })()
*/

(function(x,y){
    document.write( x + "," + y + "<br>");
    document.write("즉시실행함수"+"<br>");
})(10,20);


// * 화살표 함수
let arrow=() => document.write("화살표 함수"); //? => 자체가 익명함수
arrow();


//* 스코프(scope) 함수
//* 함수의 호출 특징
//* 호이스팅(선언위치와 호출위치의 관계)
// 함수의 호이스팅 :  함수의 선언위치를 호출위치로 끌어 올려버리는 ( 함수를 정의하고 선언을 하지만 저 및에 있는 선언위치를 낚시 하듯이 끌어당김 )

// ? 변수의 호이스팅

// ~ 함수 호이스팅 ~
// 변수 스코프(Scope)
//! 1. var: 함수레벤 스코프

function func(){
    if(true){
        var a=5; // 지역변수
        console.log(a);
    }
    console.log(a);
}
func();
// console.log(a); // 참조 할 수 없다라는 뜻


// ! 2. let, const : 블럭레벨스코프

function func(){
    if(true){
        let a=8; // 지역변수
        console.log(a);
    }
    // console.log(a);  error
}
func();

// ? var 타입은 호이스팅이 가능
console.log(a);
var a=5; // a가 메모리에 할당이 되었지만 값이 없다 varialbe은 자바의 static같은 느낌. 일단 존재는 인식 했지만 값을 인식하지 못함

//! let, const 타입은 호이스팅이 불가능
console.log(b);
let b=5; // let이 만들어진 이유가 값의 안정정성을 위해 만들어 졌는데 호이스팅이 가능해지면 값의 안정정성을 가질 수가 없기 때문에 변수가 만들어지는 순간에 값을 할당하게 만들었다