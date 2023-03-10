function sistemaNotas(nota){
    let notaCorrigida = arredondar(nota)
    if(notaCorrigida >=  40){
        console.log(`Aprovado com  nota ${notaCorrigida}.`)
    } else {
        console.log(`Reprovado com  nota ${notaCorrigida}.`)
    }

}

function arredondar(nota){
    if(nota % 5 > 2){
        return nota + ( 5 - (nota % 5))
    }else{
        return nota;
    }
}

sistemaNotas(100)
sistemaNotas(30)
sistemaNotas(38)
sistemaNotas(88)
sistemaNotas(61)