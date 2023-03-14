function receberAumento(plano, aumento){
    switch(plano){
        case 'A':
        return aumento * 1.10;
        case 'B':
        return aumento * 1.15;
        case 'C':
        return aumento * 1.20;
        default:
        return "Plano Inválido"
    }
}

console.log(receberAumento('A', 1000))
console.log(receberAumento('B', 1000))
console.log(receberAumento('C', 1000))
console.log(receberAumento('D', 1000))