function calculadora(valor1, operacao, valor2){
    switch (operacao) {
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

console.log(calculadora(3, '+', 2))
console.log(calculadora(3, '-', 2))
console.log(calculadora(3, '*', 2))
console.log(calculadora(3, '/', 2))
console.log(calculadora(3, 'a', 2))