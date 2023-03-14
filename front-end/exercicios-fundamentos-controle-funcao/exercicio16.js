function efetuarOperacao(valor1, operacao, valor2){
    switch(operacao){
        case '+':
        return valor1 + valor2
        case '-':
        return valor1 - valor2
        case '*':
        return valor1 * valor2
        case '/':
        return valor1 / valor2
        default:
        return "Operação Inválida"
    }
}

console.log(efetuarOperacao(2, '+', 3))
console.log(efetuarOperacao(2, '-', 3))
console.log(efetuarOperacao(2, '*', 3))
console.log(efetuarOperacao(2, '/', 3))
console.log(efetuarOperacao(2, 'a', 3))