
// let today=new Date();
// document.write(today);
// document.write("<br>");
// document.write(today.getFullYear(),"<br>"); // ? 연도 가져오기
// document.write(today.getMonth()+1,"<br>"); // ? 0~11
// document.write(today.getDate(),"<br>");
// document.write(today.getDay(),"<br>"); // ? 0:일요일 1: 월요일 ....6:토요일
/*
let date1 = new Date(2024,2,24);
let date2=new Date();

// 1970년
let diff = date2.getTime() - date1.getTime();
// ? 시간이 milesecond
// document.write(diff);
console.log(Math.ceil(diff/(60*1000*60*24))+"일 차이가 있다"); // 날짜 계삼
*/

// ! random
/*
document.write(Math.random()); //^ 0.0 <= r <1

// 1~7 사이의 난수
// 37.8

let ran;
for(let i=1;i<=7;i++){
    ran=Math.random();
}
console.log("round() : "+Math.round(37.8));
console.log("ceil() : "+Math.ceil(37.8));
console.log("floor() : "+Math.floor(37.8));

let r=Math.floor((Math.random()*7))+1;
console.log(r);

if(r==1){
    document.write("<img src='../images/ad1.jpg' width='100' height='100'>")
}else if(r==2){
    document.write("<img src='../images/ad2.jpg' width='100' height='100'>")
}else if(r==3){
    document.write("<img src='../images/bg1.jpg' width='100' height='100'>")
}else if(r==4){
    document.write("<img src='../images/ad2.jpg' width='100' height='100'>")
}else if(r==5){
    document.write("<img src='../images/bg3.jpg' width='100' height='100'>")
}else if(r==6){
    document.write("<img src='../images/bg4.jpg' width='100' height='100'>")
}else if(r==7){
    document.write("<img src='../images/bg5.jpg' width='100' height='100'>")
}
*/






// ! Array
// ! 크기를 정하지 않는다
// ! 값의 타입의 제항이 없다

/*
let arr=new Array();
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

console.log(arr[0]);
arr[3]=400;
console.log(arr[3]);

let arr2=new Array("a",1,true);
console.log(arr2);
*/

// let arr=[]; 값이 없는 배열
let arr=[1,2,3,4,5];

for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}

let arr1=["사당","교대","방배","강남"];
let arr2=["부평","구월","계산","서구"];

let result;
result=arr1.concat(arr2); //! concat 사용시 앞의 배열+앞의배열 해준다
console.log(result);
document.write(result);

result=arr1.slice(1,3); //? 1~2번을 잘라내겠다. == 배열을 새로 생성한다
// ? 기존 배열의 데이터는 유효하게 새롭게 생성을 한다 0부터 2번까지~
console.log(result);


result=arr1.splice(2,1);
console.log(result);

result=arr2.pop(); // ! 마지막 값을 읽어온다(삭제)
console.log(result);
console.log(arr2)

result=arr2.shift(); // ! 맨 앞쪽 값을 읽어온다(삭제)
console.log(result);
console.log(arr2);

arr1.push(result); // ! 배열의 맨 뒤쪽에 삽입
console.log(result);
console.log(arr1);

arr2.unshift(result); // ! 배열의 맨 앞쪽에 삽입
console.log(result)
console.log(arr2)




// ^ 문자열 객체
// ^ 인덱스 번호
// ^ chatAt(). indexOf(),substring()
// ^ length

// let str3="kim";
// let str3=new String("kim");
let userName = prompt("이름 입력:", " ");
document.write(userName,"<br>");
let userNum = prompt("번호 입력(구분없이입력):", " 01054432762");
let result7 = userNum.substring(0,userNum.length-4) + "****" ;
document.write(result7);


let userEmail =prompt("이메일주소","");
let arrUrl=[".co.kr",".com",".net",".or.kr","go.kr"];
let chk1=false; // @
let chk2=false; // arrUrl

let chk0=userEmail.indexOf("@");
console.log(chk0);


if(userEmail.indexOf('@')>0){ // indexof를 하면 중간에 들어가야하니까 0보다는 커야함(최소 아이디가 1자 이상일테니)
    chk1=true;
}
for(let i=0;i<arrUrl.length;i++){
    if(userEmail.indexOf(arrUrl[i])>0){ // userEmail에서 arrUrl의 i번째들 중에 들어있는게 0보다 크면 ... 못찾으면 -1이기 때문에 0보다 큰...
        chk2=true;
    }
}
if(chk1 && chk2){
    document.write(userEmail);
}else{
    alert("이메일 형식이 부적합 합니다.");
}


