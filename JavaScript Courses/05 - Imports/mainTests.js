// ATRAVÉS DO MÉTODO 'REQUIRE' conseguimos importar um arquivo com funções personalizadas a serem utilizadas no arquivo em uso.
// const functionsAux = require('./functionsAux');

const {gets, print} = require('./functionsAux');

print(gets());
