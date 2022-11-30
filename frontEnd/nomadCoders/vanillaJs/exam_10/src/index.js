const clockTitle = document.querySelector(".js-clock");

function getClock(){
    const christmasTime = new Date("2022-12-25");
    const todayTime = new Date();

    const diffTime = christmasTime - todayTime;
    const diffDay = String(Math.floor(diffTime / (1000*60*60*24)));
    const diffHour = String(Math.floor((diffTime / (1000*60*60)) % 24)).padStart(2,"0");
    const diffMin = String(Math.floor((diffTime / (1000*60)) % 60)).padStart(2,"0");
    const diffSec = String(Math.floor(diffTime / 1000 % 60)).padStart(2,"0");
    
    clockTitle.innerText = `${diffDay}d ${diffHour}h ${diffMin}m ${diffSec}s`;
}

getClock();
setInterval(getClock, 1000);