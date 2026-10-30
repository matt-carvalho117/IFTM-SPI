const btnMudar = document.getElementById("btnMudar").addEventListener("click", main);
const texto1 = document.getElementById("caixa1");
const texto2 = document.getElementById("caixa2");
const tempos = document.getElementById("tempos");

function main() {
    if (texto1.value.trim() == "")
        alert("O campo de texto não pode estar vazio");
    else
        setTimeout(trocarTexto, parseInt(tempos.value) * 1000);
}

function trocarTexto() {
    texto2.value = texto1.value.trim();
    texto1.value = "";
}