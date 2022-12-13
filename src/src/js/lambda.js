const hello = function(name) {
    console.info('Hello $(name)')
}

const username = 'fred'
const hi = hello

const sayHello = function(fn, args) {
    // if fn is a function, then i can call the function
    fn(args)
}


hello(username)
hi('barney')

sayHello(hello,'satan')