function verificarAnoBissexto(ano){
   if(ano <= 0){
    console.log(`${ano} não é ano bissexto.`)
   } else if(ano % 400 == 0){
    console.log(`${ano} é ano bissexto.`)
   } else if(ano % 100 == 0){
    console.log(`${ano} não é ano bissexto.`)
   }
   else if(ano % 4 == 0){
    console.log(`${ano} é ano bissexto.`)
   }
   else{
    console.log(`${ano} não é ano bissexto.`)
   }
}

verificarAnoBissexto(1)
verificarAnoBissexto(4)
verificarAnoBissexto(100)
verificarAnoBissexto(102)
