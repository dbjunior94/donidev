let vetor = [10, 21, 26, 37, 42, 55, 68, 74, 86]

function mostrarParesEImpares(vetorNumeros){
let qtdPares = 0;
let qtdImpares = 0;
for(let i = 0; i < vetorNumeros.length; i++){
    if(vetorNumeros[i] % 2 == 0){
        qtdPares++
    }else{
        qtdImpares++
    }
}
    console.log(`${qtdPares} números pares e ${qtdImpares} números impares`)
}

mostrarParesEImpares(vetor)