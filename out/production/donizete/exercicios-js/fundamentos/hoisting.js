// Caso do var, acontece o hoisting
console.log("a =", a)
var a = 2
console.log("a =", a)

// Caso do Let, isso não acontece. 
console.log('b =', b)
let b = 2
console.log('b =', b)

