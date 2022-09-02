function IdentificarValorDoPlano(idade){
    if(idade < 10){
        return 180
    }else if(idade < 30){
        return 150
    }else if(idade < 60){
        return 195
    }else{
        return 230
    }
}

console.log(IdentificarValorDoPlano(8))
console.log(IdentificarValorDoPlano(10))
console.log(IdentificarValorDoPlano(25))
console.log(IdentificarValorDoPlano(30))
console.log(IdentificarValorDoPlano(50))
console.log(IdentificarValorDoPlano(60))
console.log(IdentificarValorDoPlano(15))
console.log(IdentificarValorDoPlano(35))
console.log(IdentificarValorDoPlano(52))
console.log(IdentificarValorDoPlano(80))