
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

