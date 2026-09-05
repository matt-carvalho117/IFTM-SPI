nome = document.getElementById('nome');
document.getElementById('exibir').addEventListener('click', exibirNome);

function exibirNome(){
    if(nome.value.trim() != ""){
        alert(nome.value);
    }else{
        alert('O campo nome não pode estar em branco.');
    }
}
