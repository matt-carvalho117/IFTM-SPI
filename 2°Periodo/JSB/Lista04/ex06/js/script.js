users = [
    { user: "Matt", pass: 1234 },
    { user: "Anastasia", pass: 12345678 }
];

localStorage.setItem("users", JSON.stringify(users));

usersRecuperados = JSON.parse(localStorage.getItem("users"));
tabela = document.getElementById('tabela');

for (let i = 0; i < usersRecuperados.length; i++) {
    linha = document.createElement("tr");

    tdUser = document.createElement("td");
    tdUser.textContent = usersRecuperados[i].user;
    
    tdPass = document.createElement("td");
    tdPass.textContent = usersRecuperados[i].pass;

    linha.appendChild(tdUser);
    linha.appendChild(tdPass)

    tabela.appendChild(linha);

}