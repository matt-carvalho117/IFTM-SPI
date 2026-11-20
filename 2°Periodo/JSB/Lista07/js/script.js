document.getElementById("btnValidar1").addEventListener("click", function () { validarEntrada("Data de Nascimento", "dataNasc", /^\d{2}\/\d{2}\/(\d{2}|\d{4})$/) });

document.getElementById("btnValidar2").addEventListener("click", function () { validarEntrada("CPF", "cpfMascara", /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/) });

document.getElementById("btnValidar3").addEventListener("click", function () { validarEntrada("Matricula", "matricula", /^(IFTM|iftm)-\d{3}\/\d{3}-[a-zA-Z0-9]{2}$/) });

document.getElementById("btnValidar4").addEventListener("click", function () { validarEntrada("Codigo Disciplina 1", "codigoDisciplina1", /^(MT)-\d{2}\.\d{3}-(IFTM)$/i) });

document.getElementById("btnValidar5").addEventListener("click", function () { validarEntrada("Codigo Disciplina 2", "codigoDisciplina2", /^(MT)-\d{2}\.\d{3}-(IFTM|iftm)$/) });

document.getElementById("btnValidar6").addEventListener("click", function () { validarEntrada("Codigo Disciplina 3", "codigoDisciplina3", /^M ?T-\d{2}\.\d{3}-I ?F ?T ?M$/i) });

document.getElementById("btnValidar7").addEventListener("click", function () { validarEntrada("Nome do campus IFTM", "nomeCampus", /^IFTM campus Uberlândia( Centro)?$/) });

document.getElementById("btnValidar8").addEventListener("click", function () { validarEntrada("Telefone (1)", "telefone1", /^\+\d{2}\(\d{2}\)\d{5}-\d{4}$/) });

document.getElementById("btnValidar9").addEventListener("click", function () { validarEntrada("Telefone (2)", "telefone2", /^\(\d{2,3}\) ?\d{4,5}-\d{4}$/) });

document.getElementById("btnValidar10").addEventListener("click", function () { validarEntrada("Altura", "altura", /^(?:1[.,](?:3[0-9]?|[4-9][0-9]?)|2[.,](?:[0-4][0-9]?|50?))$/) });

document.getElementById("btnValidar11").addEventListener("click", function () { validarEntrada("Faturamento", "faturamento", /^R\$(0|[1-9]\d{0,2}(?:\.\d{3}){0,3}),\d{1,2}$/) });

document.getElementById("btnValidar12").addEventListener("click", function () { validarEntrada("Cronometro", "cronometro", /^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]:[0-9]{2}$/) });

function validarEntrada(titulo, campo, regex) {
    let campoInput = document.getElementById(campo).value.trim();

    if (regex.test(campoInput))
        alert(`${titulo} Valido(a)`);
    else
        alert(`${titulo} Invalido(a)`);
}