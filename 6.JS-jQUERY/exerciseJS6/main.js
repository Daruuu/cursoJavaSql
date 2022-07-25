/*
1. crea una function pasa 2 numeros pra prametros sumaos y devuelve el resultado mediante a return. muestralod por pantalla
*/
let suma =(param1, param2) => {
    console.log( param1 + param2);
}
suma(7, 15);

/*
2. crea una funcion y escribe tu nombre completo en 3 parametros:
nombren appelido1, apellido2 y concatenalos y finalmente muestralospor pantalla
*/

const nombreYApellidos = ( nombre, apellido1, apellido2) =>{
    console.log("My nombre es " + nombre + " " + apellido1 + " " + apellido2);
}
nombreYApellidos("Daruny", "Salazar", "Cardoza");

/*
3. crea una funcion que acepte 2 nums y return el numero mayor
*/
const numeroMayor = (num1, num2) => {
    if (num1 > num2) {
        console.log(num1);
    }else{
        console.log(num2);
    }
}
numeroMayor(1, 4);

