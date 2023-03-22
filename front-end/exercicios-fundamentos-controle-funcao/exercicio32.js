let vetor = [2, 5, 8, 10];

function fazerMediaVetor(vetorNumeros){
    let soma = 0; 
    for(let i = 0; i < vetorNumeros.length; i++){
            soma += vetorNumeros[i]
    }
    let media = soma/vetorNumeros.length
    return media
}

console.log(fazerMediaVetor(vetor))