function Reais(valorDecimal){
    let ValoresReais = `R$ ${valorDecimal.toFixed(2).toString().replace('.', ',')}`
    console.log(ValoresReais)
}

Reais(0.1 + 0.2)

