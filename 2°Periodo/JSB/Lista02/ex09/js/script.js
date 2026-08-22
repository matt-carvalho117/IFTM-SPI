palavra = prompt("Insira uma palavra").toLowerCase();

if(palavra === palavra.split("").reverse().join("")){
    alert(`${palavra} é um palindromo`);
}else{
    alert(`${palavra} não é um palindromo`);
}