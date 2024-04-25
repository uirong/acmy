/*
//! 함수형 객체
function CheckWeight(name,height,weight){
    this.userName=name;
    this.height=height;
    this.weight=weight;

    this.getInfo=function(){
        let str="";
        str += "이름 : "+ this.userName+", ";
        str += "키 : "+ this.height+", ";
        str += "몸무게 : "+ this.weight+", ";
        return str;
    }
}

// 사용을 해야하는데 사용 전에 생성 해야한다
let kim=new CheckWeight("김의연",161,8);
console.log(kim);
console.log(kim.userName);
console.log(kim.getInfo());
*/

//~ let obj={}
//~ 생성없이 사용한다
let obj={               // obj=[] 배열
    cat:"meow",
    dog:'woof',

    animal:function(){
        return "현재 동물은" + cat+ "과" + dog + "입니다";
    }
 }
 // 생성은 안하더라도 변수 이름으로 참조는 해야한다
 console.log(obj.cat);
 console.log(obj.dog);
 console.log(obj.animal);