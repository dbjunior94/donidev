let vetor = [-1, 5, -2, 10, 4, -10, 5, 4, -7];

function verificarNegativos(numeroNegativos){
    let qtdNegativos = 0; 
    for(let i = 0; i < numeroNegativos.length; i++){
        if(numeroNegativos[i] < 0){
            qtdNegativos++
        }
    }
    console.log(`${qtdNegativos} números negativos no vetor.`)
}

verificarNegativos(vetor)