let qtd = prompt('Insira uma quantidade positiva maior que zero:');
let nome = prompt('Insira seu nome');
let div = document.getElementById('nome');

for(let i = 0; i < qtd; i++) {
    let novoP = document.createElement('p');
    novoP.textContent = nome;
    div.appendChild(novoP);
}
