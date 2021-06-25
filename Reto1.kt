package s2


fun main() {

    ////1.-
    fun main(){
        val base = 20f
        val altura =4f
        val area = areaRectangulo(base,altura)
        println("el área del rectángulo es $area")
    }


    println("--------------")

    /////2.-
    val ancho = 2f
    val base = 2f
    val altura = 2f

    val area = areaRectangulo(base,altura)
    println("el área del rectángulo es $area")

    val volumen = volumenPrisma(base,altura,ancho)
    println("el volumen del prisma es $volumen")


    imprimir("Reemplazo del primer valor")
    imprimir("Reemplazo del primer valor","Reemplazo del segundo valor")

    val promedio = promedio(tercera = 10f)
    println("el promedio es: ${promedio}")

}

//1.- Crear una función que calcule el área de un rectángulo por medio
// de su base y altura, implementarla en main
fun areaRectangulo(base: Float, altura: Float):Float
{
    return base*altura
}

//2.- Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área
fun volumenPrisma(base: Float, altura:Float, ancho: Float):Float{
    return areaRectangulo(base,altura)*ancho
}

//3 na función puede tener parámetros con valores por defecto en caso de que no
// se setee ninguno, a continuación cómo se implementa:
fun imprimir(
    valor: String = "Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

//4.- Con el ejemplo anterior, crear una
// función que entregue el promedio de tres calificaciones. Esta debe recibir dos parámetros con
// calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido.
fun promedio(primera: Float = 8f, segunda: Float = 8f, tercera: Float): Float{
    return (primera + segunda + tercera)/3f
}