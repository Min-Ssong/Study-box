const gameForm = document.querySelector("#game-form");
const maxNum = document.querySelector("#maxNum");
const userNum = document.querySelector("#userNum");
const resultDiv = document.querySelector("#resultDiv")

function handleSubmitBtn(event) {
    event.preventDefault();
    const userValue = parseInt(userNum.value);
    const comValue = Math.ceil(Math.random() * parseInt(maxNum.value));

    resultDiv.innerText = `You chose: ${userValue}, the machine chose: ${comValue}.`;
    if (userValue === comValue) {
        resultDiv.innerHTML += "<br><b>You won!</b>";
    } else {
        resultDiv.innerHTML += "<br><b>You lost!</b>";
    }
}

gameForm.addEventListener("submit", handleSubmitBtn);