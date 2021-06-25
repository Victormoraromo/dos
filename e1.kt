package s2

import java.awt.PageAttributes
import kotlin.math.pow


//------Funciones-------------
const val PI = 3.1416f
const val PHI = 1.1618f
fun main()
{
    val radious = 4F
    val area = circlearea(radious)
    println(area)
    printName("Mi nombre Victor")
    printAge(38)
    getpi()
    val session = login("Juanito","Navaja") //utilizar la función login y guardar el resultado en una variable.
    println("Usuario loggeado? $session") // Imprimir si el usuario están ingicado.

    println("Area con valores por defecto: ${rectangleArea()}")
    println("Area con valores por defecto: ${rectangleArea(10.0)}")
    println("Area con valores por defecto: ${rectangleArea(height = 30.0)}")
    println("Area con valores por defecto: ${rectangleArea(height = 30.0,base = 10.0)}")
    println("Area con valores por defecto: ${rectangleArea(30.0, 10.0)}")
}

fun circlearea(radious: Float): Float  //se complementa con la que va a regresar por return
{
    return PI*radious.pow(2)
}

fun printName(name: String)          //como se imprime no se agrega lo que va a retornar
{
    println("Mi nombre es $name")
}

fun printAge(age: Int)
{
    println("Tengo $age años")
}

fun getpi(): Float
{
    return PI
}

val session = login("Vik","1234")

fun login(user: String, password: String) : Boolean {
    fun validate(input: String): Boolean{
        if (input.isEmpty()) {
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated  //and
    //return userValidated || passValidated  //or
}

fun rectangleArea(base:Double = 20.0,  height: Double = 30.0):Double{
    return base*height
}

//---Reto 1