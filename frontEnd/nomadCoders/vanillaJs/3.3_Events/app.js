/*
    HTML태그에 접근하는 방법은 
    getElementById,
    getElementsByClassName, 
    getElementsByTagName 등이 있지만
    querySelector을 사용하는 이유는 css처럼 접근이 가능하기때문

    특정한 event 발생 시 실행할 함수를 만들고 대기시킨다.
*/
const title = document.querySelector(".hello h1");

// title div를 클릭시 발생할 function 정의
function handleTitleClick () {
    console.log(title.innerText);
    title.style.color = "blue";
}

// function을 eventListener에 추가
title.addEventListener("click", handleTitleClick);