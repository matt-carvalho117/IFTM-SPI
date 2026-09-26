users = JSON.parse(localStorage.getItem("users"));

for(i = 0; i < users.info.length; i++)
    console.log(users.info[i].nome);