nomeCompleto = prompt('Digite seu nome completo:', "Matheus Carvalho").toLowerCase().split(" ");

nomeCompleto[0] = nomeCompleto[0].toUpperCase();

alert(nomeCompleto.join(' '));