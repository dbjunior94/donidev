function calcularAnuidade(mes, valor){
    if(mes > 0 && mes < 13){
        atraso = mes - 1
        return (valor * ((1 + (5/100)) ** atraso)).toFixed(2)    
    } else{
        return 'Valor Inválido'
    }
}

console.log(calcularAnuidade(1, 100))
console.log(calcularAnuidade(2, 100))
console.log(calcularAnuidade(3, 100))
console.log(calcularAnuidade(4, 100))
console.log(calcularAnuidade(5, 100))
console.log(calcularAnuidade(6, 100))
console.log(calcularAnuidade(7, 100))
console.log(calcularAnuidade(8, 100))
console.log(calcularAnuidade(9, 100))
console.log(calcularAnuidade(10, 100))
console.log(calcularAnuidade(11, 100))
console.log(calcularAnuidade(12, 100))
console.log(calcularAnuidade(13, 100))