document.getElementById("gato01").addEventListener("click", function mensagemOla() {
    alert("Oi " + localStorage.getItem("nome").split(" ")[0] + ", tudo bem com você?");
});

let carinhos = document.getElementById("carinhos");
let carinhosCont = 0;
document.getElementById("gato02").addEventListener("click", function incrementarContador() {
    carinhosCont += 1;
    carinhos.textContent = carinhosCont;
});

let gato03 = document.getElementById("gato03");
gato03.addEventListener("mouseover", function hoverMouse() {
    gato03.src = "assets/gato06.gif";
});
gato03.addEventListener("mouseout", function hoverMouse() {
    gato03.src = "assets/gato03.gif";
});

txt = document.getElementById("texto");
document.getElementById("gato04").addEventListener("mousemove", function passarMouse(){
    txt.textContent = "Ai, pare de fazer cócegas!";
});

document.getElementById("gato04").addEventListener("mouseout", function passarMouse(){
    txt.textContent = "lá lá lá lá lá lá";
});

document.getElementById("gerarNumeroSorte").addEventListener("click", function gerarNumero(){
    campoResultado = document.getElementById("resultadoSorte");
    campoResultado.value= Math.floor(Math.random() * 100) + 1;
});