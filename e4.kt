package s2

fun main()
{
    val numeros = listOf("one", "two", "three", "four", "five")
    println(numeros)

    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemeto: ${numeros.get(numeros.size - 1)}")
    println("Ultimo elemeto: ${numeros.get(4)}")
    println("Index del elemento \"four\": ${numeros.indexOf("four")}")
    println("----------")

    val list = mutableListOf(1, 2, 3, 4)
    //Agregar elementos
    list.add(5)
    //Remover elementos
    list.removeAt(1) //posición removida
    //Modificar elementos
    list[0] = 0  //remplazar

    println(list)

//set
//Creamos dos sets con valores únicos y desordenados en comparación entre ambos.
    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)
    println(numSet == reverseNumSet)
//Creamos un set mutable
//   var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")

//map
    val namesToAges: Map<String, Int> = mapOf("unser_one" to 20, "user_two" to 23)

    for ((key, value) in namesToAges) {
        println("$key tiene $value años")
    }

}