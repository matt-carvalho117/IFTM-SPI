btnResultado = document.getElementById('resultado');
notaBim1 = document.getElementById('bim1');
notaBim2 = document.getElementById('bim2');

btnResultado.addEventListener('click', calcularNota);


function calcularNota() {
   total = parseFloat(notaBim1.value) + parseFloat(notaBim2.value);

   if (notaBim1.value < 0 || notaBim2.value < 0 && isNaN(notaBim1) || isNaN(notaBim2)) {
      alert('foi')
   }
   else {
      if (total > 60)
         alert('Aprovado!');
      else
         alert(`Reprovado, faltam ${60 - total} pontos!`);
   }

}