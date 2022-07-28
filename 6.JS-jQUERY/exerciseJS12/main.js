/*
1. define un array con las letras a,b,c,d,e.
recorre cada uno de los elementos con forEach 
*/
const arrayLetras = ['a','b','c','d','e'];

function iterateLetras(params) {
    console.log(params);
}
arrayLetras.forEach(iterateLetras);

/*
2. define una variable
let numero = 5 que itere hasta que el valor sea 0
*/
let numero = 5;

while (numero !== 0) {
    numero--;
    console.log(numero);
}