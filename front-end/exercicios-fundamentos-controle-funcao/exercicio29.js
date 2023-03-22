let intervalo = [5, 8, 10, 12, 15, 16, 18, 19, 21, 22, 25, 31, 44];

function verificarValores(numeroIntervalo){
    let dentro = 0;
    let fora = 0; 
    for(let i = 0; i < numeroIntervalo.length; i++){
        if(numeroIntervalo[i] >= 10 && numeroIntervalo[i] <= 20){
            dentro++
        } else {
            fora++
        }
    }
    console.log(`${dentro} números dentro do intervalo e ${fora} números fora do intervalo.`)
}

verificarValores(intervalo)
