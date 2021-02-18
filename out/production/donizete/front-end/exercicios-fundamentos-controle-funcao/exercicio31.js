function numerosNegativos(vetorNegativos){
   let qtdNegativos = 0
    for(let i = 0; i < vetorNegativos.length; i++){
        if(vetorNegativos[i] < 0){
            qtdNegativos++
        }
    }
    return qtdNegativos
}

vetor = [1, 2, 5, 8, 15, 27, -3, -4, -9, -16, -28]

console.log(numerosNegativos(vetor))
