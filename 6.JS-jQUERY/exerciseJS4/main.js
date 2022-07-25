/* 1. crea nuna funcion arrow function que retorne tu nombre y tus apellidos e imprimelos por pantalla desde fuera de la funcion.*/

const nameAndSurname = () =>{
    console.log('Daruny ' + 'Salazar Cardoza'); 
}
//call the function
nameAndSurname();

/* 2. crea una funcion con nombre y sin return. pasale un tipo de dato boolean y dentro de la function imprime el valor que hemos pasado por los parametros */
function nombreCiudad(city) {
    console.log("I'm live in " + city);
}
nombreCiudad("Barcelona");

/* 3. crea una funcion que reciba parametyros infinitos, haz la llamada con los valores 1,2,3,4,5 y muestra dichos mediaante un forEach */

const numeros = [1,2,3,4,5,6,7]
/*numeros.forEach(function (numero) {
    console.log(numero);
});*/
numeros.forEach(numero => {
    console.log(numero);
});
