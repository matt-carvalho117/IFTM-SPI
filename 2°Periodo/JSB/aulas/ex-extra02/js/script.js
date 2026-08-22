txtSeparado = prompt('Digite um texto:', "Caminhao quebrou na companhia").split(" ");
letraSubstituir = prompt('Qual letra quer substituir?').toUpperCase();
letraSubstituta = prompt('Substituta:').toUpperCase();
inicial = '';

for(i = 0; i < txtSeparado.length; i++){
    inicial = txtSeparado[i].charAt(0).toUpperCase();
    if(inicial == letraSubstituir){
        txtSeparado[i] = txtSeparado.replaceAll(letraSubstituir, letraSubstituta);
    }
}
alert(txtSeparado);