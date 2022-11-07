/*
1 - Crie uma classe para representar carros.
Os carros possuem uma marca, uma cor e um gasto médio de combustível por km rodado. 
Crie um método que dado a quantidade de kms e o preço do combustível, nos dê o valor
gasto em reais para realizar este percurso.
*/

class Cars {
    brand;
    color;
    kmPerLiter;

    constructor(brand, color, kmPerLiter){
        this.brand = brand;
        this.color = color;
        this.kmPerLiter = kmPerLiter;
    }

    totalSpent(kmTraveled, fuelPrice){
        const totalSpent = (kmTraveled / this.kmPerLiter) * fuelPrice;
        console.log(`Total gasto para percorrer ${kmTraveled} km = R$ ${totalSpent.toFixed(2)}`);
    }

}

let tracker = new Cars("Chevrolet", "Azul Eclipse", 12);
tracker.totalSpent(500, 5.20);
