// Primitives - scalar types
// Scalar type -> memory stores the values
let username = "fred";
let age = 50;

// Arrays, objects - reference types
// Reference type -> memory stores a reference (memory points to the location that stores)
// e.g. int[] numList = new int[10] (have 'new' n front of them)
let numList = [1,2,3,4,5]

// Objects
let fried = {name: 'fred',
            age: 50}

// Function is a type in javascript
// Anonymous function (also known as Lambda)
// in Lambda, the parameters and the body are the most important
// let greetings = function(name) {
    //console.info('Hello' $(name))
//}

// How is a function different from a reference or scalar type?
// Functions are behaviors
// When you pass a function to a function, you're passing the behavior (what it can do) instead of what it stores
function greetings(name) {
    console.info('Hello ${name}')
}

console.info('name: ${username}, age: ${age}')
// Functions are printable because its a type:
console.info('>>> greetings: ', greetings)

// Functions can be assigned to a name
let hello = greetings
// Activate a function:
greetings(username)
hello('moto')