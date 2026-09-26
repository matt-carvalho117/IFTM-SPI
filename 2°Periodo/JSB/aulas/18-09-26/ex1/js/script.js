user = document.getElementById('user');
pass = document.getElementById('pass');
document.getElementById('btnLogin').addEventListener("click", userLogin);

function userLogin(){
    localStorage.setItem("user", user.value);
    localStorage.setItem("pass", pass.value);
    user.value = "";
    pass.value = "";
    alert("Login Realizado com sucesso!");
}