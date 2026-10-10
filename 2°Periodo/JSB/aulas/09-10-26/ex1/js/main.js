import calc from "./calculadora.js";

let val1 = document.getElementById("val1");
let val2 = document.getElementById("val2");
let resultado = document.getElementById("campoResultado");

document.getElementById("somar").addEventListener("click", function () {
    resultado.value = calc.somar(parseFloat(val1.value), parseFloat(val2.value));
})

document.getElementById("subtrair").addEventListener("click", function () {
    resultado.value = calc.subtrair(parseFloat(val1.value), parseFloat(val2.value));
})

document.getElementById("multi").addEventListener("click", function () {
    resultado.value = calc.multiplica(parseFloat(val1.value), parseFloat(val2.value));
})

document.getElementById("dividir").addEventListener("click", function () {
    resultado.value = calc.divide(parseFloat(val1.value), parseFloat(val2.value));
})

