let nota1 = parseFloat(prompt("Insira a nota do 1° bimestre:"));
let nota2 = parseFloat(prompt("Insira a nota do 2° bimestre:"));

let total = nota1 + nota2;

if(total >= 60)
    alert("Aprovado!");
else
    alert(`Reprovado!\nPontos faltantes: ${60-total}`);