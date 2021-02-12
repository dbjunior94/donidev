function lanchonete(codigoItemPedido, qtd){
    switch (codigoItemPedido) {
        case 100:
            return qtd * 3.0
        case 200:
            return qtd * 4.0
        case 300:
            return qtd * 5.5
        case 400:
            return qtd * 7.5
        case 500:
            return qtd * 3.5
        case 600:
            return qtd * 2.8
        default:
            return "Produto Não Existente"
    }
}

console.log(lanchonete(100,2))
console.log(lanchonete(200,2))
console.log(lanchonete(300,2))
console.log(lanchonete(400,2))
console.log(lanchonete(500,2))
console.log(lanchonete(600,2))
console.log(lanchonete(700,2))