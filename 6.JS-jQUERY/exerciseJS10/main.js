/*
crea una funcion en la que pasandole un string como parametro
se substituyan las letras A por las O
*/
function sustituirLetras(word1) {
    word1 = word1.replace(/a/g,"O");
    console.log(word1);
};
sustituirLetras("calAbaza");

/*
crea una funcion que compruebe si un string pasado como parametro empieza por 'aca' : academia y escuela
*/
function comprobarInput(param1) {
    const input = "aca";
    if (param1.startsWith(input)) {
        console.log(true);
    } else {
        console.log(false);
    }
}
comprobarInput("academia");
comprobarInput("escuela");


/*
crea una funcion que pasandole un Hola nos salude 3 veces utilizando metodos de String.
*/
function saludarXVeces(params) {
    const hello = "Hola";
    if (params === hello) {
        console.log(hello.repeat(3));
    }else{
        console.log("el string no es Hola");
    }
}
saludarXVeces("Hola");
saludarXVeces("helouuu");