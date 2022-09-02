function calcularValorAnuidade(mes, valorAnuidade){
    if(mes > 0 && mes < 13){
        atraso = mes - 1
        return (valorAnuidade *( (1 + ( 5/100)) ** atraso)).toFixed(2)
    }else{
        return 'Mês inválido'
    }
}
console.log(calcularValorAnuidade(4, 100))
console.log(calcularValorAnuidade(13,250))
console.log(calcularValorAnuidade(1,250))
console.log(calcularValorAnuidade(7,1500))