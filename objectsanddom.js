// Object Properties
/* let person = {
    name: 'John',
    age: 30,
    partTime: false
};
showMessage(person.name); */

/* let program = {
    name: 'JavaScript',
    version: 12,
    year: 2011
};
program.year = 2012;
showMessage(program.year); */

/* let country = {
    name: 'India',
    capital: 'Delhi',
    freedom: 1947
};
country['capital'] = 'Kolkata';
showMessage(country.capital); */

/* let mySymbol = Symbol();
let state = {
    name: 'Maharashtra',
    capital: 'Mumbai',
    estd: 'May'
};
state['estd'] = '1/May';
showMessage(state.estd); */


// Object Methods
/* let person = {
    name: 'John',
    age: 30,
    country: 'India',
    showInfo: function (){
        showMessage('showInfo function');
    }
};
person.showInfo(); */

/* let person = {
    name: 'John',
    age: 30,
    country: 'India',
    showInfo: function(){
        showMessage(this.name);
    }
};
person.showInfo(); */

/* let person = {
    name: 'John',
    age: 30,
    country: 'India',
    showInfo: function(realAge){
        showMessage(this.name + " real age is " + realAge + " and he is from " + this.country);
    }
}
person.showInfo(34); */

/* let person = {
    name: 'John',
    age: 30,
    country: 'India',
    showInfo: function(realAge){
        showMessage(this.name + " real age is " + realAge + " and he is from " + this.country);
    }
}
showMessage(typeof person.showInfo); */


// Passing Objects to Functions
// Passing values to function; call by value
/* let message = 'Hello';
function changeMessage(message){
    message = 'Hi!';
}
changeMessage(message);
showMessage(message); */

// Passing object to function; call by reference
/* let person = {
    name: 'John',
    age: 32,
    country: 'India'
};
function incrementAge(p){
    p.age++;
}
incrementAge(person);
showMessage(person.age); */