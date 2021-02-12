function mediaPonderada(codAluno, nota1, nota2, nota3){
    let notas = []
    notas.push(nota1)
    notas.push(nota2)
    notas.push(nota3)
    notas.sort((a,b) => a < b ? 1 : -1)
    
    let MediaFinal = (notas[0] * 4 + notas[1] * 3 + notas[2] * 3)/10

    console.log(`Código do Aluno: ${codAluno}. Notas: ${nota1}, ${nota2}, ${nota3} . ${MediaFinal < 5 ? 'Reprovado': 'Aprovado'}`)
}

mediaPonderada(156, 8.9, 2.5 , 5)
mediaPonderada(245, 3.3, 2.5 , 3)
mediaPonderada(123, 2.8, 6, 3.5)
mediaPonderada(200, 2.8, 6, 3.5)