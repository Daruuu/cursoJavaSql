/*
haz una function con return, invocala y muestra por console si el valor es 1  muestra cara y cruz si el valor es 0
*/
function getRandom() {
    return Math.round(Math.random());
}


function printRandomNumber() {
    const numero = getRandom();

    if(numero === 1){
        console.log("cara");
    }else{
        console.log("cruz");
    }
}
printRandomNumber();


