btnResultado = document.getElementById('resultado').addEventListener('click', calcularNota);
notaBim1 = document.getElementById('bim1');
notaBim2 = document.getElementById('bim2');

function calcularNota() {
   total = parseFloat(notaBim1.value) + parseFloat(notaBim2.value);

   if (notaBim1.value.trim() == "" || notaBim2.value.trim() == "") {
      alert('As notas não podem estar vazias.');
   }
   else if(notaBim1.value < 0 || notaBim2.value < 0){
      alert('As notas não podem ser menores que zero.');
   }
   else if(isNaN(notaBim1.value) || isNaN(notaBim2.value)){
      alert('Digite apenas numeros.');
   }
   else if(notaBim1.value > 50 || notaBim2.value > 50){
      alert('As notas de cada bimestre não podem ser maiores que 50');
   }
   else {
      if (total > 60)
         alert('Aprovado!');
      else
         alert('Reprovado!');
   }

}