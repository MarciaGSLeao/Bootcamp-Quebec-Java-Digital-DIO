/* FAÇA UM PROGRAMA PARA CALCULAR O VALOR GASTO DE COMBUSTÍVEL EM UMA VIAGEM.
    USE 3 VARIÁVEIS:
    - PREÇO DO COMBUSTÍVEL;
    - MÉDIA DE KM POR LITRO;
    - DISTÂNCIA DO PERCURSO;
*/

let fuelPrice = 4.10;
let kmPerLiter = 14.0;
let distance = 3000.0;
let litersConsumed = distance/kmPerLiter;
let totalPrice = litersConsumed * fuelPrice;

console.log(`O valor gasto é R$ ${totalPrice.toFixed(2)}`);