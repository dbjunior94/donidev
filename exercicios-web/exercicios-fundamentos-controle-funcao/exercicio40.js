function atribuirNotas(vetorNotas){
    let conceitos = []
    for(let i = 0; i < vetorNotas.length; i++ ){
        if(vetorNotas[i] >= 0 && vetorNotas[i] <= 4.9){
            conceitos.push('D')
        }else if(vetorNotas[i] >= 5 && vetorNotas[i] <= 6.9){
            conceitos.push('C')
        }else if(vetorNotas[i] >= 7 && vetorNotas[i] <= 8.9){
            conceitos.push('B')
        }else if(vetorNotas[i] >= 9 &&  vetorNotas[i] <= 10){
            conceitos.push('A')
        }else{
            conceitos.push('Nota Inválida')
        }
    }
    return conceitos
}

let notas = [10, 13, 9, 8.2, 2.5, 7.7, 6.8]
let vetorConceitos = atribuirNotas(notas)

console.log(vetorConceitos)