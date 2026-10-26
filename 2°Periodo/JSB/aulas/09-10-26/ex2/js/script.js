document.getElementById("play").addEventListener("click", play);
document.getElementById("pause").addEventListener("click", pause);

let cronometro1
function play(){
    clearInterval(cronometro1);
    cronometro1 = setInterval(numeroAleatorio, 100);
}

function pause(){
    clearInterval(cronometro1);
}
function numeroAleatorio() {
    document.getElementById("campoNumero").textContent = parseInt(Math.random() * 1000000);
}