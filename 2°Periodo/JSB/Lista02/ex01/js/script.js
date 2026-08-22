primeiroNome = prompt("Qual o seu primeiro nome?", "Matheus");
segundoNome = prompt("Qual o seu sobrenome?", "Carvalho");
cor = prompt("Qual cor deseja ver no nome? (Somente em ingles)", "red");
n = parseInt(prompt("Quantas vezes deseja imprimir o nome?", "10"));
paragrafos = document.getElementById('paragrafo');

for (i = 1; i <= n; i++){
    let novosP = document.createElement("p");
    novosP.textContent = i + " - " +  primeiroNome + " " + segundoNome;
    if(i % 2 == 0){
        novosP.style.color = cor;
    }
    paragrafos.appendChild(novosP);
}