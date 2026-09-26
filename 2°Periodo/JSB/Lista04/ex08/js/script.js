user = document.getElementById('user');
pass = document.getElementById('pass');
btnLogin = document.getElementById('login').addEventListener("click", armazenarUsers);
users = [];
usersRecuperados = JSON.parse(localStorage.getItem("users"));

function armazenarUsers() {
    if (users == null) {
        novoUser = {
            user: user.value,
            pass: pass.value
        };
        users.push(novoUser);
        localStorage.setItem("users", JSON.stringify(users));
    }else{
        
    }









}