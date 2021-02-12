const escola = "Cod3r"

console.log(escola.charAt(4))
console.log(escola.charAt(5))
console.log(escola.charCodeAt(3))
console.log(escola.indexOf('3'))

console.log(escola.substring(1))
console.log(escola.substring(0,3))

console.log('Escola '.concat(escola).concat("!"))// Concaternando Strings
console.log( 'Escola ' + escola + "!") // Faz a mesma coisa de cima
console.log(escola.replace(3,'e')) // troca o terceiro indice por e
console.log(escola.replace(/\d/, 'e')) // troca um digito por e
console.log(escola.replace(/\w/g, 'e')) // troca tudo que for digito e letra por e

console.log('Ana,Maria,Pedro'.split(','))// Cria um Array de 3 elementos
console.log('Ana,Maria,Pedro'.split(/,/))// faz a mesma coisa que o de cima

