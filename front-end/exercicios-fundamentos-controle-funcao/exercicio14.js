function selecionarFruta(fruta){
    switch(fruta){
        case 'maça':
        return "Não vendemos esta fruta aqui" 
        case 'kiwi':
        return "Estamos com escassez de kiwis" 
        case 'melancia':
        return "Aqui está, são 3 reais o quilo" 
        default:
        return "Fruta Inválida"
    }
}

console.log(selecionarFruta('maça'))
console.log(selecionarFruta('kiwi'))
console.log(selecionarFruta('melancia'))
console.log(selecionarFruta('morango'))