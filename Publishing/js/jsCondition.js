/*
let x=10;
let y=20;

if(x==y){
    document.write("같다"+"<br>");
}else{
    document.write("다르다"+"<br>");
}

if(0){
    document.write("true"+"<br>");
}else{
    document.write("false"+"<br>");
}

let money=1000;
if(money){
    document.write("true !"+"<br>");
}else{
    document.write("false !");
}

let result=confirm("정말 탈퇴할건가요?");
console.log(result);
if(result==true){
    document.write("회원탈퇴"+"<br>")
}else{
    document.write("회원탈퇴 취소","<br>")
}

// ! 중첩 가능
*/
/*
if(){
    if(){

    }else{

    }
}else{
    
}
*/
/*
let id="kim";
let pw="1234";
let userId=prompt("아이디 입력","");
let userPw=prompt("비밀번호 입력","");
if(id==userId){
    console.log(userId);
    console.log(userPw);
    if(pw==userPw){
        document.write(userId+"님 환영합니다");
    }else{
        alert("비밀번호 불일치");
        location.reload(); // ? 페이지 새로고침
    }
}else{
    console.log(userPw);
    alert("아이디 불일치");
    location.reload(); // ? 페이지 새로고침
}
*/
/*
switch(비교값){
    case 값1 : 실행코드
    break;
    case 값2 : 실행코드
    break;
    case 값3 : 실행코드
    break;
}
*/

/*
let site=prompt("네이버,다음,구글 중에 입력하기");
let url;
switch(site){
    case "네이버":url="www.naver.com/";
    break;
    case "다음":url="www.daum.net/";
    case "구글" : url="www.google.com/";
    break;
    default:alert("사이트를 찾지못하다");
}
if(url){
    location.href="https://"+url;
}else{
    location.reload;
}
*/

// console.log(i);
// for(int =0;i<10;i++){
//     document.write(i+"<br>");
// }


// let sum=0;
// var i=0;
// for(var i =1;i<=10;i++){
//     sum+=i;
// }
// console.log(sum);


/*
초기값
while(조건식){
    실행문
}
*/ 

let i=1;
while(i<=30){
    if(i%2==0 && i%6==0){
        document.write(i+" ");
    }
    i++;
}


let str;
str="<table border='1'>"
for(let i=1;i<=3;i++){ // 3행
    str+="<tr>";
    for(let j=1;j<=2;j++){ // 2열 테이블
        str +="<td>" + i + "행" + j+"열"+"</td>"
    }
    str+="</tr>";
}
str+="</table>"
document.write(str);


let tab;
var mult;
tab="<table border='1'>";
for(let i=1;i<=10;i++){ // 행 i가 1일 동안 안쪽의 j가 9번 돈다
    tab+="<tr>";
    for(let j=2;j<=9;j++){
        mul=j*(i-1);
        if(i==1){
            tab+="<th>"+j+"단"; // 맨 위 단
        }else{
            tab+="<td>"+j+"*"+(i-1)+'='+mul+"</td>"
        }
    }
    tab+="</tr>"
}
tab+="</table>";
document.write(tab);



// let tab2;
// tab2="<table border '1'>";
// for(let i=2;i<=9;i++){
//     tab2+="<tr>";
//     for(let j=1;j<=9;j++){
//         document.write(ㅓ+"*"+i+"="+(i*j)+"&nbsp;");
//     }
//     document.write(tab2+"<br>");
//     tab2+="</tr>"
// }
// tab2+="</table>";



document.write("<table border='1'>");

document.write("<tr>")
for(let i=2;i<=9;i++){
    document.write("<th>"+i+"단</th>");
}
document.write("</tr>")
for(let i=1;i<=9;i++){
    for(let j=2;j<=9;j++){
        document.write("<td>"+j+"*"+i+"="+(i*j)+"</td>");
    }
    document.write("</tr>");
}

document.write("</table>");
document.write("</tr>")