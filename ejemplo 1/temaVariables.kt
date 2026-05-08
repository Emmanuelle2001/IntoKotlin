fun main(){
    val saludo: String = "Hola" //Inmutable
    var nombre: String = "Kotlin"
    println("$saludo $nombre")

    //lectura de datos por consola

    println("Ingresa primer número")
    val num1 = readln().toInt()
    println("Ingresa segundo número")
    val num2 = readln().toInt()

    var res = num1 + num2
    println("La suma es: $res")
}