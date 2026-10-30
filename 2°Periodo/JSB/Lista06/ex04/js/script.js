x = prompt("Digite um valor em segundos:");
xAtual = parseInt(x);

if (x.trim() == "" || x == null) {
    alert("O campo não pode estar vazio, recarregue e tente novamente.");
}
else {
    let msg = document.getElementById("msg");
    msg.textContent = xAtual;
    let intervalo = setInterval(atualizarX, 1000);

    function atualizarX() {
        if (xAtual > 0) {
            xAtual--;
            msg.textContent = xAtual;
        } else {
            clearInterval(intervalo);
            window.location.href = "https://google.com";
        }
    }
}
