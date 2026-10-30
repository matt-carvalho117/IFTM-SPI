const btnMudar = document.getElementById("btnMudar").addEventListener("click", main);
const texto1 = document.getElementById("caixa1");
const texto2 = document.getElementById("caixa2");

function main() {
    if (texto1.value.trim() == "")
        alert("O campo de texto não pode estar vazio");
    else
        setTimeout(trocarTexto, 2000);
}

function trocarTexto() {
    texto2.value = texto1.value.trim();
    texto1.value = "";
}