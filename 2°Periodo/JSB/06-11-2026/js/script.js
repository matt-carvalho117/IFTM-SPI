document.getElementById("btnPlay").addEventListener("click", play);
document.getElementById("btnPause").addEventListener("click", pause);
document.getElementById("numAleatorio").addEventListener("click", verificarNum);

let numAleatorio = document.getElementById("numAleatorio");
let niveis = document.getElementById("niveis");
let totalAcertos = document.getElementById("totalAcertos");
let totalErros = document.getElementById("totalErros");
let totalPares = document.getElementById("totalPares");

let idCronometroNumAleatorio;
let qtdAcertos = 0;
let qtdErros = 0;
let qtdPares = 0;

function play(){
    clearInterval(idCronometroNumAleatorio);
    idCronometroNumAleatorio = setInterval(numeroAleatorio, niveis.value);
}

function pause(){
    clearInterval(idCronometroNumAleatorio);
}

function numeroAleatorio(){
    let numeroPar = Math.floor(Math.random() * 100 + 1);
    numAleatorio.textContent = numeroPar;
    if(numeroPar % 2 == 0){
        qtdPares++;
        totalPares.textContent = qtdPares;
    }
}

function verificarNum(e){
    if(e.target.textContent % 2 == 0){
        qtdAcertos++;
        totalAcertos.textContent = qtdAcertos;
    }else{
        qtdErros++;
        totalErros.textContent = qtdErros;
    }
}