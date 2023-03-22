function valorPlano(idade){
    if(idade < 10){
       return 180
    } else if(idade <= 30){
        return 150
    } else if(idade <= 60){
        return 195
    }else{
        return 230
    }
}

console.log(valorPlano(8))
console.log(valorPlano(10))
console.log(valorPlano(23))
console.log(valorPlano(30))
console.log(valorPlano(31))
console.log(valorPlano(55))
console.log(valorPlano(60))
console.log(valorPlano(61))
console.log(valorPlano(85))