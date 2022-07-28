/*
1. a partir de la pizza subtituye todos los elementos del array por cervezas.
*/
const foodEmojis = ["🍔", "🍱", "🌯", "🍣", "🍕", "🫕", "🍙", "🥩", "🫓"]; //9

const emojisForEach = foodEmojis.forEach(element => {
    console.log(element);
});




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

for (let i = 0; i < arrLimon.length; i++) {
    if (arrLimon[i] === "🍓") {
        arrLimon[i] = "🍄";
    }
}
console.log(arrLimon);




//5. añade un icono 👽 despues de cada 🌶️:

const arrayAlien = ["🌶️","🥛","🌶️","🥛","🌶️","🥛"];
//const alien = ["👽"];
//const anadirItem = arrayAlien.map(e => "🌶️" + "👽");

//const updateAlien = arrayAlien.splice("🌶️",0,"👽");

function newArray() {
    for (let i = 0; i < arrayAlien.length; i++) {
        while (arrayAlien[i] === "🌶️") {
            arrayAlien == arrayAlien.splice(i+1,0,"👽");
            console.log(arrayAlien);
            break;
        }
    }
}
newArray();
console.log(arrayAlien);
//console.log(anadirItem);

// añade un 🃏 entre medio de 2 cartas:

const arrComodin = [""];







