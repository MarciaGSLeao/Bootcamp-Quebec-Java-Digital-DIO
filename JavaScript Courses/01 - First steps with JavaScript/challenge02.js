/*
Elabore um algoritmo que calcule o que deve ser pago por um produto,
seguindo as condições abaixo:

1 - À vista Débito: 10% de desconto;
2 - À vista no Dinheiro ou PIX: 15% de desconto;
3 - Em 2x no crédito, preço da etiqueta sem juros;
4 - Acima de 2x no crédito, preço normal acrescido de juros de 10%.

*/

let tagPrice = 100.00;
let payment = 6;

if(payment == 1){
    console.log(`Valor Final: R$ ${(tagPrice * 0.9).toFixed(2)}`);
}else if(payment == 2){
    console.log(`Valor Final: R$ ${(tagPrice * 0.85).toFixed(2)}`);
}else if(payment == 3){
    console.log(`Valor Final: R$ ${(tagPrice).toFixed(2)}`);
}else if(payment == 4){
    console.log(`Valor Final: R$ ${(tagPrice * 1.1).toFixed(2)}`);
}else{
    console.log("Digite uma condição válida.")
}
