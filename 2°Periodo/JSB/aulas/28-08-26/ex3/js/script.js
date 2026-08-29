btnDobro = document.getElementById('mostrarDobro');
valor = document.getElementById('valor');
campoResultado = document.getElementById('resultado');

btnDobro.addEventListener('click', calcularDobro);

function calcularDobro(){
   campoResultado.value = valor.value*2
}