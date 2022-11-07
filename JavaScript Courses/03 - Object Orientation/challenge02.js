/*
2 - Crie uma classe para representar pessoas.
Para cada pessoa teremos os atributos nome, peso e altura.
As pessoas devem ter a capacidade de dizer o valor do seu IMC.
Instancie uma pessoa chamada José que tenha 70kg de peso e 1,75m de altura e peça ao José para diz o valor do seu IMC.
*/

class Person{
    nome;
    peso;
    altura;

    constructor(nome, peso, altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    calcIMC(peso, altura){
        const imc = peso / (altura * altura);
        return imc.toFixed(2) ;
    }

    classifyIMC(){
        const imc = this.peso / (this.altura * this.altura);

        if (imc < 18.5) {
            return ('Abaixo do peso.');
        } else if (imc >= 18.5 && imc < 25){
            return ('Peso normal.');
        } else if (imc >= 25 && imc < 30){
            return ('Acima do peso.');
        } else if (imc >= 30 && imc < 40){
            return ('Obeso.');
        } else {
            return ('Obesidade Grave.');
        }
    }

}

const person = new Person("José", 83, 1.58);
console.log(`IMC de ${person.nome}: ${person.calcIMC(person.peso, person.altura)} - ${person.classifyIMC()}`);
