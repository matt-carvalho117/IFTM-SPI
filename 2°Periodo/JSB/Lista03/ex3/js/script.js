document.getElementById('mostrarDobro').addEventListener('click', calcularDobro);
valor = document.getElementById('valor');
campoResultado = document.getElementById('resultado');

function calcularDobro(){
   if(valor.value.trim() != "")
      campoResultado.value = valor.value*2;
   else
      alert("O campo 'Digite um valor não pode estar vazio.'");
}