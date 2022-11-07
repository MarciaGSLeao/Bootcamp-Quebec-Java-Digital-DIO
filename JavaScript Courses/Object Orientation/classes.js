class Person{
    name;
    age;
    yearOfBirth;

    constructor(name, age){
        this.name = name;
        this.age = age;
        this.yearOfBirth = 2022 - age;
    }

    description(){
        console.log(`Meu nome é ${this.name} e tenho ${this.age} anos.`);
    }
}

function comparePeople(person1, person2){
    if(person1.age > person2.age){
        console.log(`${person1.name} é mais velha que ${person2.name}.`)
    }else if(person2.age > person1.age){
        console.log(`${person2.name} é mais velha que ${person1.name}.`)
    }else{
        console.log(`${person1.name} e ${person2.name} possuem a mesma idade.`)
    }
}
const person1 = new Person("Marcia", 32);
const person2 = new Person("Felipe", 7);

console.log(person1);
//person1.description();
console.log(person2);
//person2.description();

comparePeople(person1, person2);
