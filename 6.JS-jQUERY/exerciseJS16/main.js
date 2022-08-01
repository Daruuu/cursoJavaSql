//1. mediante a jQuery haz un boton que mediante a un toggle que cambie el texto de un parrafo al color rojo

$().ready(() => {
    //alert("this works");
    $('#btn1').click(function () {
        $("#p1").css('color', 'green');
    });
});


//2. mediante al JS haz otro boton que mediante a un toggle el color del parrafo azul

$().ready(() => {
    $('#btn2').on("click", function () {
        $('#p2').css('color', 'blue');
    });
});