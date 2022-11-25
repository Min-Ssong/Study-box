// html태그에 접근
const title = document.querySelector(".hello h1");

// title div를 클릭시 발생할 function 정의
function handleTitleClick () {
    console.log(title.innerText);
    title.style.color = "blue";
}

// function을 eventListener에 추가하고 event발생시 handleTitleClick 함수 실행
title.addEventListener("click", handleTitleClick);