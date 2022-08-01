//1. mediante a jQuery haz un boton que mediante a un toggle que cambie el texto de un parrafo al color rojo

//const p1 = document.getElementById("p1");

$().ready(() => {
    //alert("this works");
    $('#btn1').click(function(){
        $("#p1").css('color', 'green');
    });
});









//2. mediante al JS haz otro boton que mediante a un toggle el color del parrafo azul