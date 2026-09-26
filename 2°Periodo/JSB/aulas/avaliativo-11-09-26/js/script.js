primeiroNome = document.getElementById('primeiroNome');
segundoNome = document.getElementById('segundoNome');
cargo = document.getElementById('cargo');

resultadoNome = document.getElementById('nomeMaiusculo');
resultadoSigla = document.getElementById('sigla');
resultadoCargo = document.getElementById('cargoResultado');
resultadoSala = document.getElementById('sala');
resultadoImg = document.getElementById('imgCurso');

document.getElementById('btnHtml').addEventListener('click', function () {
    gerarCracha(1)
});
document.getElementById('btnCss').addEventListener('click', function () {
    gerarCracha(2)
});
document.getElementById('btnJs').addEventListener('click', function () {
    gerarCracha(3)
});

function gerarCracha(tipo) {
    if (primeiroNome.value != '' && segundoNome.value != '' && cargo.value != '') {
        resultadoNome.textContent = primeiroNome.value.toUpperCase() + " " + segundoNome.value.toUpperCase();
        nomeCompleto = primeiroNome.value + " " + segundoNome.value;
        iniciais = "";
        nomeCompleto.split(" ");
        for(let i = 0; i < nomeCompleto.length; i++){
            iniciais = nomeCompleto[i].charAt(0);
            resultadoSigla.textContent = iniciais;
        }
        //resultadoSigla.textContent = primeiroNome.value.charAt(0).toUpperCase() + segundoNome.value.split(' ')[0].charAt(0).toUpperCase() + segundoNome.value.split(' ')[1].charAt(0).toUpperCase();
        if (tipo == 1) {
            resultadoImg.innerHTML = " <img src='assets/logoHTML.webp'>";
        }
        else if (tipo == 2) {
            resultadoImg.innerHTML = " <img src='assets/logoCSS.webp'>";
        }
        else if (tipo == 3) {
            resultadoImg.innerHTML = " <img src='assets/logoJS.webp'>";
        }
        
        if (cargo.value.toLowerCase() == 'professor') {
            resultadoCargo.textContent = cargo.value.charAt(0).toUpperCase() + cargo.value.slice(1, cargo.length).toLowerCase();
            resultadoCargo.style.color = 'green';
        }
        else if (cargo.value.toLowerCase() == 'desenvolvedor') {
            resultadoCargo.textContent = cargo.value.charAt(0).toUpperCase() + cargo.value.slice(1, cargo.length).toLowerCase();
            resultadoCargo.style.color = 'red';
        }

        resultadoSala.textContent = "Sala: " + Math.floor(Math.random() * 10 + 1);
    } else {
        alert('Preencha todos os campos antes de gerar o crachá!');
    }

}