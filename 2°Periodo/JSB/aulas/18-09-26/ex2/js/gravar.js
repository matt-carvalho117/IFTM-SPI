users = {
    info: [
        { nome: "Matt", senha: "8822446ba" },
        { nome: "Anastasia", senha: "12345678" },
        { nome: "Cayde", senha: "dasdasfA" },
        { nome: "Ikora", senha: "dad1243123" }
    ]
};

localStorage.setItem("users", JSON.stringify(users)); 

user = document.getElementById('user');
pass = document.getElementById('pass');
document.getElementById('btnLogin').addEventListener("click", userLogin);

function userLogin() {
    localStorage.setItem("users", )
}
