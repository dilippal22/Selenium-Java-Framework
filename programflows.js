// 1. Conditionals using if()
/* let price = 20;
if (price === 20) {   //===; !==; >=; <=
    showMessage('discounted');
} */

/* if(1.1 + 1.3 !== 2.4){
    showMessage('true');
} */

/* if( +(1.1 + 1.3).toFixed(2) !== 2.4) {
    showMessage('true');
} */


// 2. Truthy and Falsy. What evaluates to true and what to false?
/* Falsy : false; 0; "" or '' (empty strings); null; undefined, NaN
Truthy : "0"; everything that is not falsy */


// 3. if...else
/* let price = 5;
if(price > 5){
    showMessage('greater than 5');
}else if(price < 5){
    showMessage('less than 5');
}else {
    console.log('price is neither less nor more than 5');
} */


// Comparing === and ==
/* if(1 == "1"){   //JavaScript internally converts number type to string type
    showMessage('true');
}else{
    showMessage('false');
}

if(1 === "1"){
    showMessage('true');
}else{
    showMessage('false');
} */


// The Ternary Operator
/* let price = 20;
(price > 10) ? showMessage('Yes') : showMessage('No'); */


// Block Scope Using let
/* if (true) {
    let value = 'Yes'
    showMessage(value);
}
console.log(value);

// Block Scope Using let
if (true) {
    var value = 'Yes'
    showMessage(value);
}
console.log(value); */


// Looping with for()
/* for(let i = 0; i < 3; i++){
    console.log(i);
} */


// Looping with while()
/* let count = 1;
while(count < 3){
    console.log(count);
    count++;
} */


//Looping with do...while()
/* let i = 4;
do{
    console.log(i);
    i--;
}while (i > 0); */