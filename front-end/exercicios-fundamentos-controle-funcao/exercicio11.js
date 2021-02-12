function validarAnoBissexto(ano){
    if(ano <= 0){
        return false
    }else if (ano % 400 == 0){
        return true
    }else if (ano % 100 == 0){
        return false
    }else if(ano % 4 == 0){
        return true
    }else{
        return false
    }

}
console.log(validarAnoBissexto(0))
console.log(validarAnoBissexto(4))
console.log(validarAnoBissexto(100))
console.log(validarAnoBissexto(400))
console.log(validarAnoBissexto(2020))
console.log(validarAnoBissexto(2021))
console.log(validarAnoBissexto(2048))