let n = prompt("Digite a quantidade de nomes:");
let nomes = [];
let campoNomes = document.getElementById("campoNomes");
let nomeAtual = 0;

while (n.trim() == "" || n == null || isNaN(n) || parseInt(n) <= 0) {
    alert("A quantidade não pode estar vazia, tente novamente");
    n = prompt("Digite a quantidade de nomes:");
}

for (let i = 0; i < parseInt(n); i++) {
    let nome = prompt(`Digite o ${i + 1} nome:`);

    while (nome == null || nome.trim() == "" || !isNaN(nome)) {
        alert("Digite um nome válido (apenas letras).");
        nome = prompt(`Digite o ${i + 1}º nome:`);
    }
    nomes.push(nome);
}

let intervalo = setInterval(renderizarNomes, 1000);

function renderizarNomes() {
    if (nomeAtual < nomes.length) {
        let p = document.createElement("p");
        p.textContent = nomes[nomeAtual];
        campoNomes.append(p);
        nomeAtual++;
    } else {
        clearInterval(intervalo);
    }

}