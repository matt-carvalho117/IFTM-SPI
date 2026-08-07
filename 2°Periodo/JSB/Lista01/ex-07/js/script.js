let r = prompt('Insira um valor entre 0 e 255:');
let g = prompt('Insira um valor entre 0 e 255:');
let b = prompt('Insira um valor entre 0 e 255:');

document.getElementById('text').style.color = `rgb(${r},${g},${b})`;