function maiorOuMenor(vetorMaiorMenor){
    let maior 
    let menor 
    for(let i = 0; i < vetorMaiorMenor.length; i++){
        if(maior === undefined && menor === undefined){
            maior = vetorMaiorMenor[i]
            menor = vetorMaiorMenor[i]
        }else{
            if(vetorMaiorMenor[i] > maior){
                maior = vetorMaiorMenor[i]
            }
            if(vetorMaiorMenor[i] < menor){
                menor = vetorMaiorMenor[i]
            }
        }
    }
    return[maior,menor]
}

vetor = [10, 20, 15, 43, 51, 5, 40, 9, 90]

console.log(maiorOuMenor(vetor))