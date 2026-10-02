document.getElementById('entrar').addEventListener("click", function acessarSistema(){
    let nome = document.getElementById('nome').value;
    if(nome != null && nome.split(' ').length >= 2){
        localStorage.setItem("nome", nome);
    }else{
        alert("Informe pelo menos NOME + SOBRENOME.");
    }
    window.location.href = 'menu.html';
});
