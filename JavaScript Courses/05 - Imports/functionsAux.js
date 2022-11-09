function gets(){
    return "Aprendendo a importar por Gets";
}

function print(texto){
    console.log(texto);
}

// O MODULE.EXPORTS informa entre suas respectivas chaves quais os métodos serão passados como passíveis de serem utilizados no .js que requerer tais métodos.
module.exports = {gets, print};
