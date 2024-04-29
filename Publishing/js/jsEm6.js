//! var, let, const
//! 함수의 호이팅 ( 선언위치 호출위치 )
//! 화살표 함수
/*
this.num=10; // 전역변수 느낌으로 window의 this를 뜻한다
let obj={ //? 직접 개체를 중괄호를 이용한 경우 바로 호출 할 수 있다
    num:5,
    add1:function(a){
        console.log(this.num+a, this); //? this = obj
    },
    add2:(a) => {
    //! 화살표 함수는 this가 없다
        console.log(this.num+a,this); //? this = window(스크립트 전체) 이때의 this.num은 없는 값이다
    } 
}.bind(this); //~ bind :모든 함수의 메소드로 context를 수정하게 해주는 것. bind는 함수처럼 호출 가능한 "특수객체"를 반환한다.
                    ~ 이 객체를 호출하면 this가 원하는 형태로 고정된 함수가 반환
! 바인딩한 함수는 원본 함수 객체를 감싸는 함수로써, 바인딩한 함수를 호출하면 일반적으로 래핑된 함수가 호출 된다
obj.add1(3);
obj.add2(3);
*/



function addNum(a=0,b=0){
    console.log(a+b);
    console.log(a);
    console.log(b);
}
addNum(5); // ? undefined : 값이 없다
/*


//~ EM5
function addNum(){ // 기변형인자
    //! arguments : 데이터를 받는 이름
    for(let i=0;i<arguments.length;i++){ // 가변형 인자 : 내부적으로 사용할 수 있게 변형
        console.log(arguments[i]) // 1 / 2 / 3
    }
}
console.log(addNum());
console.log(addNum(1));
console.log(addNum(1,2,3)); // 배열구조
*/



/*
//EM6
function addNum(...Numbers){
    for(let i=0;i<Numbers.length;i++){
        console.log(Numbers[i]);
    }
}
addNum(1,2,3);
*/




//! 펼침연산자
/*
let numbers=[1,2,3,4,5]
console.log(numbers);
console.log(...numbers); // 값이 낱개로 뿌려진다
*/
let number=[1,2,3,4,5]
let max;
max=Math.max(...number); // Math.max(2,3,1,6,4)
console.log(max);

// ^ 펼침 연산자가 밑의 함수를 대신한다
/*
for(let i=0;i<number.length;i++){
    if(number[i]>number[0]){// 0번째보다 number가 클때
        max=number[i];
    } 
} console.log(max);
*/



for( let i of number){ //! 스크립트의 향상된 for문
    console.log(i); // 1/2/3/4/5
}



//! 표현식 (백티)
/*
let name="kim";
console.log("나의 이름은"+ name + "입니다");
*/

let num1=1;
let num2=2;
let text= `${num1} 과 ${num2} 의 합계는 : ${num1+num2} 입니다`
console.log(text);



//! 배열의 비구조화
/*
let Numbers=[3,4];
let a,b;
a=Numbers[0];
b=Numbers[1];
*/
let Numbers = [3,4,5]; // ? 알아서 가운데(4)를 누락 시킨다
let[a,b] = Numbers; // 인덱싱할 필요 x
let[c, ,d] = Numbers;
// console.log(a); console.log(b);
console.log(`${c} ${d}`);


//em6에서 바뀐 부분에서 바뀐부분
let num=[1,2,3];
let[a1 , ...b1]=num; // 마지막 넘어온게 중요하다 
console.log(a1); console.log(b1);


