btnLogin = document.getElementById('login').addEventListener("click", function loginLocal() {
    user = document.getElementById('user');
    pass = document.getElementById('pass');
    logins = {
        user: user.value,
        pass: pass.value
    }
    localStorage.setItem("login", JSON.stringify(logins));
    user.value = "";
    pass.value = "";
    alert("Usuário cadastrado com sucesso!");
});
