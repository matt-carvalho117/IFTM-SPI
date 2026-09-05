valor1 = document.getElementById('valor1');
valor2 = document.getElementById('valor2');
resultado = document.getElementById('resultado');

document.getElementById('soma').addEventListener('click', somarDoisNumeros);
document.getElementById('subtracao').addEventListener('click', subtrairDoisNumeros);
document.getElementById('multiplicacao').addEventListener('click', multiplicarDoisNumeros);
document.getElementById('divisao').addEventListener('click', dividirDoisNumeros);

function somarDoisNumeros() {
    if(valor1.value != "" && valor2.value != "") {
        if(!isNaN(valor1.value) && !isNaN(valor2.value)) {
            resultado.value = parseFloat(valor1.value) + parseFloat(valor2.value);
        }
        else {
            alert("Por favor, insira valores numéricos válidos.");
        }
    }
    else{
        alert("Preencha os dois campos para realizar a operação!");
    }
}

function subtrairDoisNumeros() {
    if(valor1.value != "" && valor2.value != "") {
        if(!isNaN(valor1.value) && !isNaN(valor2.value)) {
            resultado.value = parseFloat(valor1.value) - parseFloat(valor2.value);
        }
        else {
            alert("Por favor, insira valores numéricos válidos.");
        }
    }
    else{
        alert("Preencha os dois campos para realizar a operação!");
    }
}

function multiplicarDoisNumeros() {
    if(valor1.value != "" && valor2.value != "") {
        if(!isNaN(valor1.value) && !isNaN(valor2.value)) {
            resultado.value = parseFloat(valor1.value) * parseFloat(valor2.value);
        }
        else {
            alert("Por favor, insira valores numéricos válidos.");
        }
    }
    else{
        alert("Preencha os dois campos para realizar a operação!");
    }
}

function dividirDoisNumeros() {
    if(valor1.value != "" && valor2.value != "") {
        if(!isNaN(valor1.value) && !isNaN(valor2.value)) {
            if (parseFloat(valor2.value) === 0){
                alert("Não é possível dividir por zero!");
            }
            else{
                resultado.value = parseFloat(valor1.value) / parseFloat(valor2.value);
            }
        }
        else {
            alert("Por favor, insira valores numéricos válidos.");
        }
    }
    else{
        alert("Preencha os dois campos para realizar a operação!");
    }
}
