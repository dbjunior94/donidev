function validarNotas(nota){
  let notaCorrigida = arrendodar(nota)
  if(notaCorrigida >= 40){
      console.log(`Aprovado com a nota ${notaCorrigida}`)
  } else{
      console.log(`Reprovado com a nota ${notaCorrigida}`)
  }
}

function arrendodar(nota){
    if(nota % 5 > 2){
        return nota + ( 5 - (nota % 5))
    } else{
        return nota
    }
}

validarNotas(100)
validarNotas(30)
validarNotas(38)
validarNotas(88)
validarNotas(61)