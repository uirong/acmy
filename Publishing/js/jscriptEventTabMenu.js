window.addEventListener('DOMContentLoaded',function(){
    let tabItem=this.document.querySelectorAll(".tab__item");
    let tabContent=this.document.querySelectorAll(".tab__content");

    tabItem.forEach((item,index)=> {
        item.addEventListener("click",function(event){
            event.preventDefault(); //! a태그에 대한 링크속성을 제거한다
            // alert("tab"); test
            tabItem.forEach((content)=>{
                content.classList.remove("active");
            }); // tab__item active 삭제
            tabContent.forEach((content)=>{
                content.classList.remove("active"); // active가 없으니 display none 됨
            }); // tab__content active 삭제

            // 선택한 item의 위치를 찾아서 이벤트를 발생시킨 index값을 얻는다
            tabItem[index].classList.add("active");
            tabContent[index].classList.add("active");
        }); // addEventListener end
    }); // forEach end
});