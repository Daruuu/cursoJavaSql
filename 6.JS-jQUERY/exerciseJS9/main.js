/*
como crear un numero aleatorio (0 o 1 ) con el metrod random de Math
*/
function getRandomNumb() {
    return Math.round(Math.random());
}
console.log(getRandomNumb());

/*
investiga como redondear el valor de Math.PI 3,1415 a la parte decimal 3 mediante el metodo floor de math
*/
//The Math.floor() method rounds a number DOWN to the nearest integer.

const roundNum = Math.floor(Math.PI);
console.log(roundNum);