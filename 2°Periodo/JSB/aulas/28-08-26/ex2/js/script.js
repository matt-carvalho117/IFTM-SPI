paragrafo = document.getElementById('paragrafo1');

paragrafo.addEventListener('click', mudarCor);
paragrafo.addEventListener('mouseout', function(corFundo){restaurarCor});

function mudarCor(){
    paragrafo.style.color = 'red';
    paragrafo.style.backgroundColor = 'yellow'
}

function restaurarCor(){
    paragrafo.style.color = '';
     paragrafo.style.backgroundColor = '';
}
