btn = document.getElementById('btnTestar');

btn.addEventListener('click', () => exibirMsg(1));
btn.addEventListener('mouseout', () => exibirMsg(2));
btn.addEventListener('mousemove', () => exibirMsg(3));

function exibirMsg(sit) {
    if (sit == 1) {
        alert('ola');
    } else if (sit == 2) {
        alert('ate logo');
    } else {
        alert('pare de fazer cocegas');
    }
}

