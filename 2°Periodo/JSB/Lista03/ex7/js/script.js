login = document.getElementById("login");
senha = document.getElementById("senha");
confirmarSenha = document.getElementById("confirmarSenha");

document.getElementById('entrar').addEventListener('click', realizarLogin);

function realizarLogin() {
    if(login.value != ""){
        if(senha.value != "" && confirmarSenha.value != ""){
            if(senha.value == confirmarSenha.value){
                alert("Login realizado com sucesso!");
            }
            else{
                senha.value = "";
                confirmarSenha.value = "";
                alert("As senhas não coincidem!");
            }
        }
        else{
            alert("Preencha todos os campos de senha!");
        }
    }
    else{
        alert("Preencha o campo de login!");
    }
}