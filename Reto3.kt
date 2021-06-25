package s2
/*
Crear y utilizar una función que regrese el número de veces que se repite un
nombre en la siguiente lista de nombres:
Pedro Luis, Juan Manuel, Juan Luis, María Inés, Romeo, Ernesto,
Juan Pedro, Ariadna, Mireya María, Ana Sofía, José Juan

 */

fun main()
{
    val nombres = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan"
    )

    fun countName(name: String): Int{
        var count = 0
        for(currentName in nombres){
            if(name in currentName){
                count++
            }
        }
        return count
    }

    val nameCount = countName("Pedro")
    println("Tu nombre se encontró $nameCount veces")
    println("--------------")

    var y = 20
    do{
        y--
        println(y)
    }while (y > 0)


}

