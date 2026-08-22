txtSeparado = prompt('Insira um texto: ', 'amor carro bola bexiga caminhão aranha pastel').split(" ");
alfabeto = "abcdefghijklmnopqrstuvwxyz";

for (let a = 0; a < alfabeto.length; a++) {
    letraAtual = alfabeto.charAt(a);
    encontrou = false;

    for (i = 0; i < txtSeparado.length; i++) {
        inicial = txtSeparado[i].charAt(0).toLowerCase();
        if (inicial ===letraAtual) {
            encontrou = true;
            break;
        }
    }
    if (encontrou) {
        document.write(`<p>Palavras iniciadas com a letra ${letraAtual}:</p><ul>`);
        
        for (let i = 0; i < txtSeparado.length; i++) { 
            if (txtSeparado[i].charAt(0).toLowerCase() == letraAtual) { 
                document.write(`<li>${txtSeparado[i]}</li>`); 
            } 
        }
        
        document.write("</ul>");
    }

}