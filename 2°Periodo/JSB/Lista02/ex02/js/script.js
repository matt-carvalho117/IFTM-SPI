nomeCompleto = prompt("Digite seu nome completo:").trim();

if (nomeCompleto != null) {
    if (nomeCompleto != "") {
        document.write(`<p>${nomeCompleto}</p>`);
        document.write(`<p>${nomeCompleto} tem ${nomeCompleto.length} caracteres.</p>`);
    } else {
        document.write("<p>Nome inválido. Tente novamente!</p>");
    }
} 