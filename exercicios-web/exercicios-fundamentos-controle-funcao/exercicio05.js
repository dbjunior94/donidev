function FormatandoNumeroDecimal(valorDecimal){
    valorEmReais = `R$ ${valorDecimal.toFixed(2).toString().replace(".", ",")}`
    console.log(valorEmReais)
}
FormatandoNumeroDecimal(0.1 + 0.2)

