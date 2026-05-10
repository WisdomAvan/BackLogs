const prompt = require("prompt-sync")();


pizzaMenuMethod();

function getTheNumberOfBoxes(numberOfPersons, numberOfSlices) {
    return Math.ceil(numberOfPersons / numberOfSlices);
}

function getTheRemainingLeftOverSlice(numberOfPersons, numberOfSlices) {
    const totalSlices =
        getTheNumberOfBoxes(numberOfPersons, numberOfSlices) * numberOfSlices;

    return totalSlices - numberOfPersons;
}

function getTheTotalPriceOfPizza(numberOfPersons, numberOfSlices, priceOfPizza) {
    const numberOfBoxes =
        getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

    return numberOfBoxes * priceOfPizza;
}

function pizzaMenuMethod() {

    const pizzaMenu = `
                WELCOME TO IYA SCAMBIRAH PIZZA JOINT
__________________________________________________________
|                   |                   |                |
|  Pizza Size       | Number Of Slices | Price Per Box  |
|___________________|___________________|________________|
| Sapa Size         |      4            | ₦2,000.00      |
| Small Money       |      6            | ₦2,400.00      |
| Big Boys          |      8            | ₦3,000.00      |
| Odugwu            |      12           | ₦4,200.00      |
|___________________|___________________|________________|
`;

    console.log(pizzaMenu);

    let pizzaType = prompt("Enter Type Of Pizza: ").toLowerCase();

    let numberOfPersons = parseInt(
        prompt("How Many People Wants To Eat Pizza?: ")
    );

    switch (pizzaType) {

        case "sapa size": {
            console.log("Sapa Size");

            let numberOfSlices = 4;
            let priceOfPizza = 2000;

            let numberOfBoxes =
                getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

            let leftOverSlice =
                getTheRemainingLeftOverSlice(numberOfPersons, numberOfSlices);

            let totalPrice =
                getTheTotalPriceOfPizza(
                    numberOfPersons,
                    numberOfSlices,
                    priceOfPizza
                );

            console.log(`
Number of boxes needed: ${numberOfBoxes}
Remaining slices: ${leftOverSlice}
Total price: ₦${totalPrice.toLocaleString()}
            `);
            break;
        }

        case "small money": {
            console.log("Small Money");

            let numberOfSlices = 6;
            let priceOfPizza = 2400;

            let numberOfBoxes =
                getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

            let leftOverSlice =
                getTheRemainingLeftOverSlice(numberOfPersons, numberOfSlices);

            let totalPrice =
                getTheTotalPriceOfPizza(
                    numberOfPersons,
                    numberOfSlices,
                    priceOfPizza
                );

            console.log(`
Number of boxes needed: ${numberOfBoxes}
Remaining slices: ${leftOverSlice}
Total price: ₦${totalPrice.toLocaleString()}
            `);
            break;
        }

        case "big boys": {
            console.log("Big Boys");

            let numberOfSlices = 8;
            let priceOfPizza = 3000;

            let numberOfBoxes =
                getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

            let leftOverSlice =
                getTheRemainingLeftOverSlice(numberOfPersons, numberOfSlices);

            let totalPrice =
                getTheTotalPriceOfPizza(
                    numberOfPersons,
                    numberOfSlices,
                    priceOfPizza
                );

            console.log(`
Number of boxes needed: ${numberOfBoxes}
Remaining slices: ${leftOverSlice}
Total price: ₦${totalPrice.toLocaleString()}
            `);
            break;
        }

        case "odugwu": {
            console.log("Odugwu");

            let numberOfSlices = 12;
            let priceOfPizza = 4200;

            let numberOfBoxes =
                getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

            let leftOverSlice =
                getTheRemainingLeftOverSlice(numberOfPersons, numberOfSlices);

            let totalPrice =
                getTheTotalPriceOfPizza(
                    numberOfPersons,
                    numberOfSlices,
                    priceOfPizza
                );

            console.log(`
Number of boxes needed: ${numberOfBoxes}
Remaining slices: ${leftOverSlice}
Total price: ₦${totalPrice.toLocaleString()}
            `);
            break;
        }

        default:
            console.log("Invalid Pizza Type");
    }
}
