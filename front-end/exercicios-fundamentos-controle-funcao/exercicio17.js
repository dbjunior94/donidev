function aumentoSalario(plano,salarioAtual){
    switch (plano) {
        case 'A':
            return salarioAtual + (salarioAtual * (10/100))
        case 'B':
            return salarioAtual + (salarioAtual * (15/100)) 
        case 'C':
            return salarioAtual + (salarioAtual * (20/100))
        default:
            return "Erro, plano inválido"
    }
}

console.log(aumentoSalario('A', 1320.00))
console.log(aumentoSalario('B', 1320.00))
console.log(aumentoSalario('C', 1320.00))
console.log(aumentoSalario('D', 1320.00))
console.log(aumentoSalario('A', 1000.00))
console.log(aumentoSalario('B', 1000.00))
console.log(aumentoSalario('C', 1000.00))
console.log(aumentoSalario('D', 1000.00))