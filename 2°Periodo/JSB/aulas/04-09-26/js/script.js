let vetVotosCands = [0, 0, 0, 0, 0, 0];

for (let i = 0; i < vetVotosCands.length; i++) {
    document.getElementById('votosCand' + (i + 1)).textContent = vetVotosCands[i];
    document.getElementById("btnIncrementar" + (i + 1)).addEventListener(
        "click", function () {
            incrementarVotos(i);
        }
    );
}

function incrementarVotos(nroCand) {
    vetVotosCands[nroCand]++;
    document.getElementById('votosCand' + (nroCand + 1)).textContent = vetVotosCands[nroCand];
}
