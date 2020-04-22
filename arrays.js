// Creating and Initializing Arrays
/* const values = ['a', 'b', 'c'];
showMessage(values);
console.log(values); */

/* const values = Array.of(1, 2, 3);
showMessage(values);
console.log(values); */


// Accessing Array items
/* const values = ['a', 'b', 'c'];
showMessage(values[0]);
console.log(values[1]); */

/* const values = ['a', 'b', 'c'];
values[0] = 'ab';
showMessage(values[0]);
console.log(values[0]); */


// Manipulating Arrays
// Push : add element at end to array
/* const values = ['a', 'b', 'c'];
values.push('d', 'e');
console.log(values); */

// Pop : Remove last element from Array
/* const values = ['a', 'b', 'c'];
let remVal = values.pop();
console.log(values, remVal); */

// shift : Remove first element from Array
/* const values = ['a', 'b', 'c'];
let remVal = values.shift();
console.log(values, remVal); */

// unshift : Add element at first in Array
/* const values = ['a', 'b', 'c'];
let addVal = values.unshift('Hello', 'World');
console.log(values, addVal); */

// Slice() and Splice()
// Slice() is used to create a new array
/* const values = ['a', 'b', 'c', 'd', 'e', 'f'];
let newValues = values.slice(3,5);
console.log(newValues); */

// Splice() is used to delete and insert into an array
/* const values = ['a', 'b', 'c', 'd', 'e', 'f'];
values.splice(3, 1);
console.log(values); */

// Splice() is used to delete and insert into an array
/* const values = ['a', 'b', 'c', 'd', 'e', 'f'];
values.splice(3, 2, 'Dilip');
console.log(values); */


// Arrays Searching and Loopings
/* const values = ['a', 'b', 'c', 'd', 'e', 'f'];
let indexPos = values.indexOf('c');
showMessage(indexPos);
console.log(indexPos); */

/* const values = ['a', 'b', 'c', 'd', 'e'];
const set = values.filter(function(item){
    return item > 'a';
});
console.log(set); */

/* const values = ['a', 'bb', 'cccccc', 'd', 'eee'];
const found = values.find(function(item){
    return item.length > 5;
});
console.log(found); */

/* const values = ['a', 'b', 'c', 'd', 'e'];
values.forEach(function(item){
    console.log(item);
}); */


// Arrays in the DOM
/* const containers = 
    document.getElementsByClassName('container');
    containers[1].classList.add('d-none');
console.log(containers); */