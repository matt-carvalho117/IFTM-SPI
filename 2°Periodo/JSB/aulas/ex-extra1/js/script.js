txtSeparado = prompt('Digite seu nome:', "Instituto Federal do Trinagulo Mineiro").split(" ");
let sigla = "";
for(let i = 0; i < txtSeparado.length; i++){
    if(txtSeparado[i].length > 3){
        sigla += txtSeparado[i].charAt(0); 
    }
}
alert(sigla);