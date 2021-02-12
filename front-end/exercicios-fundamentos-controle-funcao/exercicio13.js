function diasDaSemana(dia){
    switch (dia) {
        case 1:
            return"Fim de semana"
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            return"Dia útil"
        case 7:
           return "Fim de semana"
        default:
           return "Data inválida"
    }
}

console.log(diasDaSemana(1))
console.log(diasDaSemana(2))
console.log(diasDaSemana(3))
console.log(diasDaSemana(4))
console.log(diasDaSemana(5))
console.log(diasDaSemana(6))
console.log(diasDaSemana(7))
console.log(diasDaSemana('a'))