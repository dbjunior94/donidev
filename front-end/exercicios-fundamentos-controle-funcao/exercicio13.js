function obterDiaDaSemana(diaSemana){
    switch(diaSemana){
        case 1 : 
        return 'Fim de semana!'
        case 2: 
        case 3:
        case 4: 
        case 5: 
        case 6 : 
        return 'Dia útil!'
        case 7:
        return 'Fim de semana!'
        default:
        return 'Dia Inválido!'
    }
}

console.log(obterDiaDaSemana(1))
console.log(obterDiaDaSemana(2))
console.log(obterDiaDaSemana(3))
console.log(obterDiaDaSemana(4))
console.log(obterDiaDaSemana(5))
console.log(obterDiaDaSemana(6))
console.log(obterDiaDaSemana(7))
console.log(obterDiaDaSemana(8))