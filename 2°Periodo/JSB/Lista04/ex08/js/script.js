document.getElementById('login').addEventListener("click", function armazenarUsers() {
    user = document.getElementById('user');
    pass = document.getElementById('pass');
    userData = {user: user.value, pass: pass.value};
    userVet = JSON.parse(localStorage.getItem('users')) || [];

    if(userVet.length == 0) {
        userVet.push(userData);
        localStorage.setItem('users', JSON.stringify(userVet));
        alert("Usuário cadastrado com sucesso!");
    }else{
        achou = false;
        for(i = 0; i < userVet.length; i++) {
            if(userData.user == userVet[i].user) {
                alert("Usuário já cadastrado!");
                achou = true;
                break;
            }
        }
        if(!achou) {
            userVet.push(userData);
            localStorage.setItem('users', JSON.stringify(userVet));
            alert("Usuário cadastrado com sucesso!");
        }
    }
});


