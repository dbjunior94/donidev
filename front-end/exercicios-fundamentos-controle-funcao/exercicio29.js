function intervaloDeNumerosVetor(vetorNumeros){
    let qtdsDentroIntervalo = 0

    for(let i = 0; i < vetorNumeros.length; i++){
        if(vetorNumeros[i] >= 10 && vetorNumeros[i] <= 20){
            qtdsDentroIntervalo++
        }
    }

    return `${qtdsDentroIntervalo} números dentro do intervalo `
}

vetor = [1, 5, 10,11, 12, 15, 17, 18, 20, 21, 25, 30]
console.log(intervaloDeNumerosVetor(vetor))
