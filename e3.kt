package s2

fun main()
{
    //cuanta todos

    for (i in 1..5) {
        println(i)
    }
    println("-------------")
//no cuenta el ultimo valor
    for (i in 1 until 5) {
        println(i)
    }
    println("-------------")
//cada ciclo sube cada 2
    for (i in 0..10 step 2) {
        println(i)
    }




    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )
    println("-------------")
    for (nombre in nombres){
        println(nombre)
    }
    println("-------------")
    nombres.forEach{ println(it) }

 for(nombre in nombres){
  println(nombre)
     if(nombre=="Link")
     {
         println("personaje encontrado")
         break
     }
 }

    print("----------------")

    var x = 20

    while (x > 0) {
        println(x)
        x--
    }






}