fun main(parametro: Array<String>) {
    println("Ingresa coordenada x del punto:")
    val x = readLine()!!.toInt() 
    
    println("Ingrese coordenada y del punto:")
    val y = readLine()!!.toInt() 
    
    when {
        x > 0 && y > 0 -> println("Primer cuadrante")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}