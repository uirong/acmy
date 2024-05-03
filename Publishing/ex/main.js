$(function(){
    let duration=300;

    let $aside= $(".page-main > aside"); //? $가 붙어있으면 객체정보를 갖고있구나 라고 생각하기
    let $asidButton= $aside.find("button").on("click",function(){
        $aside.toggleClass("open")//? 현재 상태를 확인해서 css를 빼거나 넣거나 할 수 있다
        if($aside.hasClass('open')){ //? 처음 상태는 닫혀있고 open이 보이도록
            //* 화면에 보이게
            /*
            $aside.stop(true).animate({left:"-70px"},duration,'easeOutBack') //? 현재 진행되고 있는 애니메이션이 멈춰진다
            */
           $aside.stop(true).animate({right:"-20px"},duration,'easeOutBack')
            $asidButton.find('img').attr('src','img/btn_close.png');
                        //img 찾아라  //^ attr : 속성 바꾸는 태그  src를 변경하기
        }else{//* 화면에 숨기기
            /*
            $aside.stop(true).animate({left:"-350px"},duration,'easeOutBack');
            */
            $aside.stop(true).animate({right:'-350px'},duration,'easeOutBack')
            $asidButton.find('img').attr('src','img/btn_open.png');
        }
    });
});
