/*
1. a partir de la pizza subtituye todos los elementos del array por cervezas.
*/
const foodEmojis = ["🍔","🍱","🌯","🍣","🫕","🍕","🍙","🥩","🫓"];


//const emojisForEach = foodEmojis.forEach(element => {
//    console.log(element);
//});
/*
function replaceArrayPosition() {

    for (let i = 0; i < foodEmojis.length; i++) {
        const newVar = foodEmojis.indexOf("🍕");
    
        if ( newVar === "🍕"){
            foodEmojis[i].replace("🍺");
        }
    console.log(foodEmojis);
    }
}
replaceArrayPosition();
*/
function replaceArrayItem() {
    for (let i = 0; i < foodEmojis.length; i++) {
        const element = foodEmojis[i];
        
        if (element === "🍕") {
            element.replaceArrayItem("🍺");
        }
    }
    
}



//2. encontrar si existe un elemento en el array que sea un pina.

const arrayPinas = ["🍕","🍕","🍍","🍕","🍕",];

//3. quita la pina del array

arrayPinas.reduce(2,"🍍");
console.log(arrayPinas);

//4. convierte todas las fresas en 🍄

const arrayLimon = ["🍓","🍋","🍓","🍋","🍓"];



/*
*/





/*
*/