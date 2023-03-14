function factorial(numero){
    if(numero == 0){
        return 1
    } else{
        return numero = numero * factorial(numero -1)
    }
}

console.log(factorial(6))