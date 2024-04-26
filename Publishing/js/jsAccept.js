function acceptAll(){
    // alert('aa');

    //! 전체 동의 누르면 전체 체크 되는 것
    let chAll=document.querySelector('#checkAll');
    if(chAll.checked){ // ? 체크가 되면 true가 된다
        // ? checkbox가 가지고 있는 속성 : checked ... check가 안되어있으면 false
        let checkboxs=document.querySelectorAll('.chk');
        for(let checkbox of checkboxs){
            checkbox.checked=true;
        }
    }else{ // ? 체크가 되면 false가 됨
        let checkboxs=document.querySelectorAll('.chk');
        for(let checkbox of checkboxs){
            checkbox.checked=false;
        }
    }
}