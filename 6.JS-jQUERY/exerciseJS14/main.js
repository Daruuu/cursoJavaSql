/*
1. a partir de la pizza subtituye todos los elementos del array por cervezas. 🍺
*/
const foodEmojis = ["🍔", "🍱", "🌯", "🍣", "🍕", "🫕", "🍙", "🥩", "🫓"]; //9

const emojisForEach = foodEmojis.forEach(element => {
    console.log( element);
});

const birra = "🍺";
foodEmojis.splice(5, 4, birra, birra, birra, birra);

console.log("modify array : " + foodEmojis);


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

const arrayAlien = ["🌶️", "🥛", "🌶️", "🥛", "🌶️", "🥛"];
console.log("original arrayAlien : " + arrayAlien);

function newArray() {
    for (let i = 0; i < arrayAlien.length; i++) {
        while (arrayAlien[i] === "🌶️") {
            arrayAlien == arrayAlien.splice(i + 1, 0, "👽");
            break;
        }
    }
    //console.log("original array: " +arrayAlien);
}
newArray();
console.log("modified arrayAlien: " + arrayAlien);




// añade un 🃏 entre medio de 2 cartas:

const arrComodin = ["🎴", "🎴", "🎴", "🃏", "🎴", "🎴", "🎴"];
console.log("original arrayComodin ==> " + arrComodin);

const joker = "🃏";
arrComodin.splice(1,0,joker);
arrComodin.splice(3,0,joker);
arrComodin.splice(7,0,joker);
arrComodin.splice(9,0,joker);

console.log("new arrayComodin ==> " + arrComodin);

