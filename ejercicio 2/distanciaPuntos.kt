import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("Punto 1:")
    print("Ingresa x1: ")
    val x1 = readln().toDouble()
    print("Ingresa y1: ")
    val y1 = readln().toDouble()

    println("\nPunto 2:")
    print("Ingresa x2: ")
    val x2 = readln().toDouble()
    print("Ingresa y2: ")
    val y2 = readln().toDouble()

    val restaX = x2 - x1
    val restaY = y2 - y1
    
    val distancia = sqrt(restaX.pow(2) + restaY.pow(2))

    println("La distancia entre los dos puntos es: $distancia")
}