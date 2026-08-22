vetorPalavrasTexto = prompt('Digite um texto:').split(" ");

primeira = vetorPalavrasTexto[0];
ultima = vetorPalavrasTexto[vetorPalavrasTexto.length - 1];

document.write(`<p> ${primeira} ${ultima}</p>`);