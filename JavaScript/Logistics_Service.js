const readline = require("readline");

const rl = readline.createInterface({input: process.stdin,output: process.stdout});

rl.question("\nEnter the number of successful deliveries\n", (answer) => {
    
    const successfulDelivery = parseInt(answer);
    
    if(successfulDelivery > 0 && successfulDelivery < 50){
    console.log(deliveryPackageIsLesserThanFiftyPercent(successfulDelivery));
    }
    else if (successfulDelivery >= 50 && successfulDelivery <= 59 ){
    console.log (deliveryPackageIsBetweenFityAndFityNinePercent(successfulDelivery));

    } else if(successfulDelivery >=60 && successfulDelivery <=69){
    console.log (deliveryPackageIsBetweenSixtyAndSixtyNinePercent(successfulDelivery));
    }
    else{
    console.log (deliveryPackageIsGreaterThanSeventy(successfulDelivery));
    }   

});
    


const BASED_SALARY = 5000;

function deliveryPackageIsLesserThanZero(successfulDelivery){

    if (successfulDelivery < 0) {return null} 
}


function deliveryPackageIsLesserThanFiftyPercent(successfulDelivery){
    deliveryPackageIsLesserThanZero(successfulDelivery);
    
    const commissionPerParcel = 160

    return successfulDelivery > 0 && successfulDelivery < 50 ? successfulDelivery * commissionPerParcel + BASED_SALARY : null;

}


function deliveryPackageIsBetweenFityAndFityNinePercent(successfulDelivery){

    deliveryPackageIsLesserThanZero(successfulDelivery);
    const commissionPerParcel = 200

    return successfulDelivery >= 50 && successfulDelivery <= 59 ? successfulDelivery * commissionPerParcel + BASED_SALARY : "Delivery out of range";

}


function deliveryPackageIsBetweenSixtyAndSixtyNinePercent(successfulDelivery){

    deliveryPackageIsLesserThanZero(successfulDelivery);
    const commissionPerParcel = 250

    return successfulDelivery >=60 && successfulDelivery <=69 ? successfulDelivery * commissionPerParcel + BASED_SALARY : "Delivery out of range";

}


function deliveryPackageIsGreaterThanSeventy(successfulDelivery){

    deliveryPackageIsLesserThanZero(successfulDelivery);
    const commissionPerParcel = 500

    return successfulDelivery >= 70 && successfulDelivery <= 100 ?  successfulDelivery * commissionPerParcel + BASED_SALARY : "Delivery out of range";

}


