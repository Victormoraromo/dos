package s2
/*
Crear una función que pida como parámetros las medidas de los lados de un triángulo.
Debe imprimirnos el tipo de tríangulo:

Equilatero: los tres lados tienen el mismo valor
Isóceles: Tiene dos lados iguales
Escaleno: Los tres lados son diferentes
Utilizar la expresión condicional if - else if - else . Para evaluar más de un valor en la sentencia if, debemos utilizar los operadores lógicos && (AND), || (OR) y ! (NOT)

No olvides ejecutar varias pruebas para comprobar que tu algoritmo funciona correctamente!
 */

fun main()

{

    tipoDeTriangulo(1,1,1)
    tipoDeDato(1.0)
}

fun tipoDeTriangulo(lado1: Int, lado2: Int, lado3: Int){

    if(lado1==lado2 && lado2==lado3){
        println("Es un triángulo equilátero")
    } else if(
        (lado1==lado2 && lado3!=lado1 ) ||
        (lado2==lado3 && lado1!=lado2 ) ||
        (lado3==lado1 && lado2!=lado3) ){
        println("Es un triángulo isóceles")
    } else{
        println("Es un triángulo escaleno")
    }
}

fun tipoDeDato(dato: Any){
    when(dato){
        is String -> println("Es una String")
        is Int -> println("Es un Entero")
        is Double -> println("Es un Doble")
        else -> println("Tipo de dato no soportado")
    }
}