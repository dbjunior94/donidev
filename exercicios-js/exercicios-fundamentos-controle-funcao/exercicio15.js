function revendaCarros(carro){
    switch (carro) {
        case 'hatch':
           return "Compra efetuada com sucesso" 
        case 'sedan':
        case 'motocicleta':
        case 'caminhonete':
            return "Tem certeza que não prefere este modelo?"   
        default:
            return "Não trabalhos com este tipo de automóvel aqui"
    }
}

console.log(revendaCarros('hatch'))
console.log(revendaCarros('sedan'))
console.log(revendaCarros('motocicleta'))
console.log(revendaCarros('caminhonete'))
console.log(revendaCarros('jestki'))