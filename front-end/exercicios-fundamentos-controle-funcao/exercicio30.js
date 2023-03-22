let vetor = [10, 55, 8, 90, 21, 35, 56, 101, 3]
function maiorEMenor(vetorNumeros){
    let maior 
    let menor

    for(let i = 0; i < vetorNumeros.length; i++){
        if(maior === undefined && menor === undefined){
            maior = vetor[i]
            menor = vetor[i]
        }else{
        if(vetorNumeros[i] > maior){
            maior = vetorNumeros[i];
        }
        if(vetorNumeros[i] < menor){
            menor = vetorNumeros[i];
        }
    }
    }
    console.log(`O maior valor do vetor é ${maior} e o menor valor é ${menor}.`)
}

maiorEMenor(vetor)