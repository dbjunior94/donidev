function mediaAritmetica(vetorMedia){
    let somaMedia = 0
    for(let i = 0; i < vetorMedia.length; i++){
        somaMedia += vetorMedia[i]
    }

    return somaMedia/ vetorMedia.length
}

vetor = [1, 2, 3, 4, 5]

console.log(mediaAritmetica(vetor))