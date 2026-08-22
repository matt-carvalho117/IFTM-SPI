numero = parseInt(prompt('Digite um numero inteiro positivo maior ou igual a 2:'));

if(numero >= 2){
    document.write("<table><thead><tr><th>Base Decimal</th><th>Base binária</th><th>Base hexadecimal</th></tr></thead><tbody>")
    for(i = 0; i <= numero; i++){
        document.write("<tr><td>" + i.toString(10)+ "</td><td>" + i.toString(2) + "</td><td>" + i.toString(16) + "</td></tr>")
    }
    document.write("</tbody></table>");
}else{
    alert('Digite um numero positivo e maior ou igual a 2');
}