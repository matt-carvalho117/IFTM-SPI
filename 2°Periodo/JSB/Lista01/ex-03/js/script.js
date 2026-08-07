let nome = prompt("Digite seu nome completo:");
let idade = prompt("Digite sua idade:");

if(idade >= 18) 
    alert(`${nome}, você já possui idade para tirar carteira.`);
else
    alert(`${nome}, você ainda não possui idade para tirar carteira, ainda falta(m) ${18-idade} ano(s).`);

