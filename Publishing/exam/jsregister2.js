window.addEventListener('DOMContentLoaded',function(){
    document.getElementById("idValue").value=window.opener.document.getElementById("id").value
});

function sendId(){
    window.opener.document.getElementById("id").value=document.getElementById("idValue").value
    window.close();
}