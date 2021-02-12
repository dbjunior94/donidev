function tiposDeTriangulos(a,b,c) {
    if(a == b && b == c){
        console.log('Equilátero')
    }else if (a== b || b==c || a==c) {
        console.log("Isósceles")
    } else {3
        console.log("Escaleno")
    }
}

tiposDeTriangulos(1, 1, 1)