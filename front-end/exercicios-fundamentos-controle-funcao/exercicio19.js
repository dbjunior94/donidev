function escolherProduto(codigoProduto, qtdProduto){
    switch(codigoProduto){
        case 100:
        return qtdProduto * 3
        case 200:
        return qtdProduto * 4
        case 300:
        return qtdProduto * 5.5
        case 400:
        return qtdProduto * 7.5
        case 500:
        return qtdProduto * 3.5
        case 600:
        return qtdProduto * 2.8
        default: 
        return "Produto não existente"
    }
}

console.log(escolherProduto(100, 2))
console.log(escolherProduto(200, 2))
console.log(escolherProduto(300, 2))
console.log(escolherProduto(400, 2))
console.log(escolherProduto(500, 2))
console.log(escolherProduto(600, 2))
console.log(escolherProduto(700, 2))