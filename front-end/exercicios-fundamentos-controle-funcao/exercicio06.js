function JurosSimples(capitalInicial, taxaJuros, tempoAplicacao){
    return capitalInicial + ( capitalInicial * taxaJuros * tempoAplicacao)
}
function JurosComposto(capitalInicial, taxaJuros, tempoAplicacao){
    return capitalInicial * (1 + taxaJuros) ** tempoAplicacao
}

console.log(JurosSimples(100, 10/100, 2))
console.log(JurosComposto(100, 10/100, 2))