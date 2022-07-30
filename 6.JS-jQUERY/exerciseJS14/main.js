/*
1. a partir de la pizza subtituye todos los elementos del array por cervezas. 🍺
*/
const foodEmojis = ["🍔", "🍱", "🌯", "🍣", "🍕", "🫕", "🍙", "🥩", "🫓"]; //9
const emojisForEach = foodEmojis.forEach(element => {
    console.log(element);
});

function reemplazaPizza() {
    for (let i = 0; i < foodEmojis.length; i++) {
        //const element = array[i];
        while (foodEmojis[i] === "🍕") {
            replaceItem = foodEmojis.replace(foodEmojis[5-8],"🍺");
            break;
        } 
        console.log(foodEmojis);
    }
}
reemplazaPizza();



//2. encontrar si existe un elemento en el array que sea un pina.
//3. quita la pina del array

const arrayPinas = ["🍕", "🍕", "🍍", "🍕", "🍕"]; //4
console.log("original array: " + arrayPinas);
function removeItemPina(arrayPinas, pina) {
    let i = arrayPinas.indexOf(pina);
    if (i >= 0) {
        arrayPinas.splice(i, 1);
    }
    console.log("array update: " + arrayPinas);
};
removeItemPina(arrayPinas, "🍍");



//4. convierte todas las fresas en 🍄

const arrLimon = ["🍓", "🍋", "🍓", "🍋", "🍓"];
console.log("array original ==> " + arrLimon);
function convertirAChampin() {
    for (let i = 0; i < arrLimon.length; i++) {
        if (arrLimon[i] === "🍓") {
            arrLimon[i] = "🍄";
        }
    }
    console.log("array modificado ==> " + arrLimon);
};
convertirAChampin();



//5. añade un icono 👽 despues de cada 🌶️:

const arrayAlien = ["🌶️","🥛","🌶️","🥛","🌶️","🥛"];

function newArray() {
    for (let i = 0; i < arrayAlien.length; i++) {
        while (arrayAlien[i] === "🌶️") {
            arrayAlien == arrayAlien.splice(i+1,0,"👽");
            break;
        }
    }
    console.log(arrayAlien);
}
newArray();
console.log(arrayAlien);




// añade un 🃏 entre medio de 2 cartas:

const arrComodin = ["🎴","🎴","🎴","🃏","🎴","🎴","🎴"];

function name(params) {
    
}







