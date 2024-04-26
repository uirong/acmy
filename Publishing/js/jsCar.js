function car(){
    // alert("car"); test
    // ? ID속성값으로 가지고 오다
    // let basic_car=parsInt(document.getElementById("total").defaultValue);
    // ? defaultValue : 기존value에 있는 값을 가져오는 속성

    // ! Number : 숫자면 다 상관없다
    // * defaultValue(초기 value값이 fix됨) 가 아니라 Value를 사용하면 폼에 들어가는 값을 나타낸다 매번 값이 달라짐
    // * 값이 변한상태에서(체크한 후) 값을 가져오는 것이 아니라 매번 체크 할 때마다 value설정한 값을 나타낸다
    let basic_car=Number(document.getElementById("total").defaultValue);

    // ~옵션이 체크 된 만큼 값을 채워준다
    for(let i=1;i<=3;i++){  // ?  1부터 3까지
// check된 값+ 기본값
let chkObj=document.getElementById("opt" + i) // opt1 opt2 opt3 반복해서 3번 돌때 opt i(숫자))
                                //* opt : 변수 ... " opt + i"(x) 합치지 않기
        if(chkObj.checked){
            basic_car+= Number(chkObj.value);// basic_car에 추가한 값 넣기
        }
    }
    document.getElementById("total").value=basic_car; // basic_car

}