function parOuImpar(vetorNumeros){
    
    let qtdPares = 0
    let qtdImpares = 0
    for(let i = 0; i < vetorNumeros.length; i++){
        if(vetorNumeros[i] % 2 == 0){
            qtdPares++
        }else{
            qtdImpares++
        }
    }
    console.log(`${qtdPares} números pares e ${qtdImpares} números ímpares. `)
}
numeros = [10, 3, 11, 16, 34, 75, 99, 50, 98]
parOuImpar(numeros)