textoSeparado = prompt('Digite um texto:').split(" ");
letra = prompt("Digite uma letra: ");

for(i = 0; i < textoSeparado.length; i++){
    if(textoSeparado[i].charAt(0) == letra){
        document.write(textoSeparado[i] + " ");
    }
}
