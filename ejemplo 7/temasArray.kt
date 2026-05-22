fun main(parametro: Array<String>) {
    // Declaración e inicialización en una sola línea usando el nombre en plural
    val sueldos = IntArray(5)
    
    // Carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingresa sueldo: ")
        sueldos[i] = readln().toInt()
    }
    
    // Impresión de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}