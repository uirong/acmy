let str ="<table border='1'>"; // ? 바깥쪽은 "" 안쪽은 '' 로 구분하기 오류 많이 발생
str+="<tr>";
str+="<td>1</td> <td>2</td> <td>3</td>";
str+="</tr>";
str+="</table>";
document.write(str);

let w= prompt("당신의 몸무게를 입력: ","0");
// w를 사용하기 위해서는 이 전체 경과를 숫자로 바꿔주는 역할을 해야한다
w=parseInt(w); // ! parseInt에서 제공하는 숫자로 바꿔주는 함수
document.write(w);
console.log(w);

let h= prompt("당신의 키를 입력: ","0");
w=parseInt(h); 
document.write(h);
console.log(h);

let avg=(h - 100) * 0.9;
document.write(avg);
console.log(avg);