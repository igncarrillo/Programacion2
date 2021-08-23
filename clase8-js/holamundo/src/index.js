//escribir en la consola del navegador
console.log('Hola mundo')

//levantar una ventana con el msj
window.alert("Cuidado con la viborita")

//formas de declarar variable

let variable= 'Hola'
const constante = 'mundo'

let resultado = variable + constante
window.alert(resultado)


//Funciones
function suma (a,b){
    return a+b
}

console.log("Resultado suma: " +suma(3,5))


//Expresiones de funciones

const multiplicacion = function (a,b){
    return a*b
}

console.log("Resultado multiplicacion: " +multiplicacion(3,5))

//funciones flecha

const resta = (a,b) => {
    return a-b
}

console.log("Resultado resta: " +resta(3,5))

//otra forma de f flecha
const otraresta = (a,b) => a-b

console.log("Resultado otra resta: " +otraresta(3,5))


//ejercicio 1
window.alert("Ejercicio 1")
const sumageneral = (a,b) => {
    if(a===b){
        return a
    }

    if (a > b) {
        [a,b]=[b,a]
    }

    let ac =0
    for (let v = a; v<=b; v++){
        ac+=v
    }
    return ac
}
console.log('Resultado suma general :'+sumageneral(5,3))


//asignacion desestructurante

const arreglo = [1,2,3,4]

let [a]=arreglo
console.log("Valor: ",a)

let [,b]=arreglo
console.log("Valor: ",b)

let [,,,c]=arreglo
console.log("Valor: ",c)

const ob = {
    "nombre":"juan",
    "apellido": "lopez",
    "edad":54,
}

console.log('Objeto completo: ',ob)

const {apellido} = ob
console.log('Apellido: '+apellido)

