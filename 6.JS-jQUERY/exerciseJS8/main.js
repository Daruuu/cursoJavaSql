/*
1.realiza un switch case que muestre el mes del año cuando lo introduzcamos en formato numerico (1 al 12)
*/
function generaNumAleatorio(min = 1, max = 12) {
    let diferencia = max - min;
    let aleatorio = Math.random();
    aleatorio = Math.floor(aleatorio * diferencia);
    aleatorio += min;
    return aleatorio;
}
const aleatorioEntreUnoYDoce = generaNumAleatorio(); 
switch (aleatorioEntreUnoYDoce) {
    case 1:
        console.log("Enero");
        break;
    case 2:
        console.log("Febrero");
        break;
    case 3:
        console.log("Marzo");
        break;
    case 4:
        console.log("Abril");
        break;
    case 5:
        console.log("Mayo");
        break;
    case 6:
        console.log("Junio");
        break;
    case 7:
        console.log("Julio");
        break;
    case 8:
        console.log("Agosto");
        break;
    case 9:
        console.log("Septiempre");
        break;
    case 10:
        console.log("Octubre");
        break;
    case 11:
        console.log("Noviembre");
        break;
    case 12:
        console.log("Diciembre");
        break;
    default:
        console.log("Introduce un numero del 1 al 12");
        break;
}

/*
2. 1.realiza un switch case el que puedas introducir un numero del 1 al 5 en un string y lo tranforme en numero
*/
function generateRandom(min = 1, max = 5) {
    let diferencia = max - min;
    let aleatorio = Math.random();
    aleatorio = Math.floor(aleatorio * diferencia);
    aleatorio += min;
    return aleatorio;
}
//console.log(generateRandom());
const numeroAleatorio = generateRandom();

switch (numeroAleatorio) {
    case 1:
        console.log("1");
        break;
    case 2:
        console.log("2");
        break;
    case 3:
        console.log("3");
        break;
    case 4:
        console.log("4");
        break;
    case 5:
        console.log("5");
        break;
    default:
        
        break;
}
