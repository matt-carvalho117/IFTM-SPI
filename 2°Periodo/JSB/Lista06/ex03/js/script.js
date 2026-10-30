let nomeUser = prompt("Digite seu nome completo");
let campoNome = document.getElementById("campoNome");
let tamanhoAtual = 14;

if (nomeUser.trim() == "" || nomeUser == null) {
    alert("O nome não pode estar vazio. Recarregue a página e tente novamente");
} else {
    p = document.createElement("p");
    p.textContent = nomeUser;
    p.style.fontSize = tamanhoAtual + "px";
    campoNome.append(p);

    let intervalo = setInterval(verificarTamanho, 500);

    function verificarTamanho() {
        if (tamanhoAtual < 40) {
            tamanhoAtual += 2;
            p.style.fontSize = tamanhoAtual + "px";
        } else {
            clearInterval(intervalo);
        }
    }
}
