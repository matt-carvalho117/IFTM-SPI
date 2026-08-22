texto = prompt('Insira um texto:', 'O carro quebrou na estrada de São Paulo. O carro foi levado para a oficina.');
palavra1 = prompt('Insira a primeira palavra:', 'carro');
palavra2 = prompt('Insira a segunda palavra:', 'caminhao');


if (texto != null) {
    if (palavra1 && palavra2 != null) {
        alert(texto.replaceAll(palavra1, palavra2));
    } else {
      alert('As palavras nao podem estar vazias')
    }
}else{
      alert('Operacao cancelada pelo usuario');
}
