// Function Basics
/* function logMessage(){
    console.log('logMessage function');
}

logMessage();
logMessage(); */


// Function Expressions
/* let myFn = function(){
    console.log('loggingMessage function');
}

myFn(); */

/* let myFn = function loggingMessage(){
    console.log('loggingMessage function');
}

myFn(); */


// Passing Information to Functions
/* let _Fn = function(name){
    console.log(name);
}
_Fn('Jill'); */

/* let myFn = function(firstName, lastName){
    console.log(firstName, lastName);
}
myFn('John','Hopkins');
myFn('John');
myFn('John',''); */


// Function Return Values
/* function getSecretCode(value){
    let code = value * 10;
    return code;
}
showMessage(getSecretCode(2));
console.log(getSecretCode(2)); */

/* function getSecretCode(value){
    let code = value * 10;
}
showMessage(getSecretCode(2));
console.log(getSecretCode(2)); */


// Function Scope
/* function getSecretCode(value){
    let code = value * 10;
    return code;
}
console.log(code); */

/* let key = 10;
function getSecretCode(value){
    let code = value * key;
    return code;
}
showMessage(getSecretCode(2));
console.log(getSecretCode(2)); */

/* let key = 10;
function getSecretCode(value){
    let keyGenerator = function(){
        let key = 5;
        console.log('keyGenerator: ', key);
        return key;
    }
    let code = value * keyGenerator();
    console.log('getSecretCode: ', key);
    return code;
}
showMessage(getSecretCode(2));  //console-keyGenerator: 5; Page-10
console.log(getSecretCode(2));  // console-keyGenerator: 5;getSecretCode: 10;console-10 */


// Using Functions to modify Web Pages
// changePercentOff(30);