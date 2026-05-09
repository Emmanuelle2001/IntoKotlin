fun main() {
    println("Multiplicación mediante sumas sucesivas")
    
    print("Ingresa el primer número (a): ")
    val a = readln().toInt()
    
    print("Ingresa el segundo número (b): ")
    val b = readln().toInt()

    var resultado = 0

    for (i in 1..b) {
        resultado += a
    }

    println("El resultado de multiplicar $a por $b es: $resultado")
}