const notas = [];

notas.push(8)
notas.push(5.4)
notas.push(7.4)
notas.push(9.8)

let soma = 0;

for(let i = 0; i < notas.length; i++){
    let nota = notas[i];
    soma = soma + nota;
}
let media = soma / notas.length;

console.log(`Média ${media.toFixed(2)}`);
