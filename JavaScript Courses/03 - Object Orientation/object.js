const person = {
    name: "Márcia",
    lastName: "Gameleira",
    age: 32,

    description: function(){
        console.log(`Meu nome é ${this.name} ${this.lastName} e minha idade é ${this.age} anos.`);
    }
}
person.hight = 1.58;
person.description();

person.name = "Felipe";
person.lastName = "Leão";
person.age = 7;
person.description();

// OUTRA MANEIRA DE ACESSAR UM ATRIBUTO DE UM OBJETO.
const attribute = 'age'
console.log(person[attribute]);
