const colors = [
    "#ef5777",
    "#575fcf",
    "#4bcffa",
    "#34e7e4",
    "#0be881",
    "#f53b57",
    "#3c40c6",
    "#0fbcf9",
    "#00d8d6",
    "#05c46b",
    "#ffc048",
    "#ffdd59",
    "#ff5e57",
    "#d2dae2",
    "#485460",
    "#ffa801",
    "#ffd32a",
    "#ff3f34"
];

const changeColorButton = document.querySelector("body button");

function handleClickButton() {
    let firstColor = 0;
    let secondColor = 0;
    while (true) {
        firstColor = Math.floor(Math.random() * colors.length);
        secondColor = Math.floor(Math.random() * colors.length);
        if ( firstColor !== secondColor ) {
            break;
        }
    }
    document.body.style.background = `linear-gradient(135deg, ${colors[firstColor]}, ${colors[secondColor]})`;
}

changeColorButton.addEventListener("click", handleClickButton);