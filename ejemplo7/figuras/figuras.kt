fun main() {
    var opcion: Int

    do {
        println("\n--- Menú de Áreas ---")
        println("1. Cuadrado")
        println("2. Triángulo")
        println("3. Círculo")
        println("4. Rectángulo")
        println("5. Salir")
        print("Seleccione una opción: ")
        
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> areaCuadrado()
            2 -> areaTriangulo()
            3 -> areaCirculo()
            4 -> areaRectangulo()
            5 -> println("Saliendo...")
            else -> println("Opción no válida, intente de nuevo.")
        }
    } while (opcion != 5)
}

fun areaCuadrado() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    val resultado = lado * lado
    println("El área del cuadrado es: $resultado")
}

fun areaTriangulo() {
    print("Ingrese la base: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese la altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    val resultado = (base * altura) / 2
    println("El área del triángulo es: $resultado")
}

fun areaCirculo() {
    print("Ingrese el radio del círculo: ")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0
    val resultado = 3.1416 * (radio * radio)
    println("El área del círculo es: $resultado")
}

fun areaRectangulo() {
    print("Ingrese la base: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese la altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    val resultado = base * altura
    println("El área del rectángulo es: $resultado")
}