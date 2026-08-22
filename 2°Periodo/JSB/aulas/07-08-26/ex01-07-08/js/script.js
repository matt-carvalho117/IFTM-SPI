let n1 = parseFloat(prompt('Digite o primeiro numero'));
let n2 = parseFloat(prompt('Digite o segundo numero'));
let op = prompt('Digite o tipo de operação');



switch(op){
    case '+':
        alert(n1+n2);
    break;
    case '-':
        alert(n1-n2);
    break;
    case '*':
        alert(n1*n2);
    break;
    case '/':
        if(n1 == 0 || n2 == 0)
            alert('Numero invalido');
        else
            alert(n1/n2);
    break;
    default:
        alert('Operador Inválido!');
}
