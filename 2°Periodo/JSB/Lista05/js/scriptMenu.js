let nomeJogador = document.getElementById('nomeJogador');
let nomeCompleto = localStorage.getItem("nome");
let nomeSeparado = nomeCompleto.split(" ");
let primeiroNome = nomeSeparado[0];
let ultimoNome = nomeSeparado[nomeSeparado.length - 1];
nomeJogador.textContent = primeiroNome + " " + ultimoNome;

document.getElementById('entrarJogo').addEventListener('click', function entrarNoJogo() {
    window.location.href = 'felino.html';
});