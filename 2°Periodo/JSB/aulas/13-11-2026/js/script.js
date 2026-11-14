document.getElementById("btnValidar").addEventListener("click", validarTexto);

function validarTexto() {
    //Verificacao se existe pelo menos 1 numero
    //let padrao = /\d/;

    //Verificacao se existe pelo mneos 1 num no inicio
    //let padrao = /^\d/

    //Verifica numero no final
    //let padrao = /\d$/

    //Verifica 1 numero
    //let padrao = /^\d$/

    //Verifica 2 numeros
    //let padrao = /^\d\d$/

    //Verifica se existe exatos 11 numeros
    //let padrao = /^\d{11}$/;

    //Validar DDD
    //let padrao = /^\d{2,3}$/;

    //Validar ddd com 2 ou mais
    //let padrao = /^\d{2,}$/;

    //Validar numero opcional
    //let padrao = /^\d{0,1}$/;

    //Validar numero de telefone com DDD
    //let padrao = /^\d{2,3}\s\d{4,5}-\d{4}$/;

    //Validar numero de telefone com DDD entre aspas
    //let padrao = /^\(\d{2,3}\)\s{0,1}\d{4,5}-\d{4}$/;

    //Validar cpf
    let padrao = /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/;

    //Validacao numero matricula
    //let padrao = /^(IFTM|IF)-\d{3}$/;

    //Valiacao case sensitive
    //let padrao = /^(IFTM|IF)-\d{3}$/i;


    //Validar apenas letras abcd min 2 max 8
    //let padrao = /^[abcd]{2,8}$/

    //Validar letras de j-z
    //let padrao = /^[j-z]{2,8}$/;

    //Validar letras de a-z maiusculas e minusculas
    //let padrao = /^[A-z]{2,8}$/;
    //let padrao = /^[A-Za-z]{2,8}$/;

    //Validar expressao aritimetica
    //let padrao = /^\d{1,}(\+|\-|\*|\/)\d{1,}((\+|\-|\*|\/)\d{1,}){0,}$/;

    //Validar caracteres nao numericos
    //let padrao = /^\D$/

    //Validar alfanumericos
    //let padrao = /^\w$/

    //Validar caracteres especiais
    //let padrao = /^\W$/


    //let padrao = /^\d?$/;

    
    let campoTexto = document.getElementById("txtInfo").value;

    if (padrao.test(campoTexto))
        alert("Valido");
    else
        alert("Invalido");

}