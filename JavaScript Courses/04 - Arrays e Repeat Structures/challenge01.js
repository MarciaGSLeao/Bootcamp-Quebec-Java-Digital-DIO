// Crie um programa que dado um número imprima a sua tabuada.

let number = 5;

console.log("SOMA")
for (let n = 0; n <= 10; n++) {
    console.log(`${number} + ${n} = ${number + n}`);
}

console.log("\nSUBTRAÇÃO")
for (let n = 0; n <= 10; n++) {
    console.log(`${number} - ${n} = ${number - n}`);
}

console.log("\nMULTIPLICAÇÃO")
for (let n = 0; n <= 10; n++) {
    console.log(`${number} x ${n} = ${number * n}`);
}

console.log("\nDIVISÃO")
for (let n = 0; n <= 10; n++) {
    if(n == 0){
        console.log(`${number} / ${n} = "Não é possível divisão por 0"`);
        continue;
    }
    console.log(`${number} / ${n} = ${(number / n).toFixed(2)}`);
}
