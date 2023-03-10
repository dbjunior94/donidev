let stringPontuacoes1 = "10, 20, 20, 8, 25, 3, 0, 30, 1"
let stringPontuacoes2 = "30, 40, 20, 4, 51, 25, 42, 38, 56, 0"

function avaliaPontuacoes (stringPontuacoes){
    let pontuacoes = stringPontuacoes.split(", ")
    let maiorPontuacao = pontuacoes[0]
    let menorPontuacao = pontuacoes[0]
    let piorJogo = 1;
    let qtdRecords = 1;
    for(let i = 1; i < pontuacoes.length; i++){
        if(pontuacoes[i] > maiorPontuacao){
            maiorPontuacao = pontuacoes[i]
            qtdRecords++
        } else if(pontuacoes[i] < menorPontuacao){
            menorPontuacao = pontuacoes[i]
            piorJogo = i + 1
        }
    }
    return [qtdRecords, piorJogo]
}

console.log(avaliaPontuacoes(stringPontuacoes1))
console.log(avaliaPontuacoes(stringPontuacoes2))