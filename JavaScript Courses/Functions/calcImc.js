
function calcImc(weight, hight){
    return weight / (hight * hight);
}

function classifyImc(imc){
    if (imc < 16){
        return "Magreza Grau III";
    }else if(imc >= 16 && imc < 16.9){
        return "Magreza Grau II";
    }else if (imc >= 17 && imc < 18.5){
        return "Magreza Grau I";
    }else if (imc >= 18.5 && imc < 25){
        return "Eutrofia";
    }else if (imc >= 25 && imc < 30){
        return "Sobrepeso";
    }else if (imc >= 30 && imc < 35){
        return "Obesidade Grau I";
    }else if (imc >= 35 && imc <= 40){
        return "Obesidade Grau II";
    }else if (imc > 40){
        return "Obesidade Grau III";
    }else{
        return "Dados inválidos."
    }
}

(function (){
    const weight = 82.3;
    const hight = 1.58;
    let imc = calcImc(weight, hight);

    console.log("IMC =", imc.toFixed(2), "-", classifyImc(imc));
})();