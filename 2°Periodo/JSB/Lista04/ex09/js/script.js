document.getElementById('login').addEventListener("click", function armazenarUsers() {
    user = document.getElementById('user');
    pass = document.getElementById('pass');
    userData = {user: user.value, pass: pass.value};
    userVet = JSON.parse(localStorage.getItem('users')) || [];

    if(userVet.length == 0) {
        userVet.push(userData);
        localStorage.setItem('users', JSON.stringify(userVet));
        alert("USUÁRIO INEXISTENTE");
    }else{
        achou = false;
        for(i = 0; i < userVet.length; i++) {
            if(userData.user == userVet[i].user && userData.pass == userVet[i].pass) {
                alert("USUÁRIO JÁ EXISTENTE");
                achou = true;
                break;
            }
        }
        if(!achou) {
            alert("USUÁRIO INEXISTENTE");
            userVet.push(userData);
            localStorage.setItem('users', JSON.stringify(userVet));
        }
    }
});


