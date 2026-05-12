fun main() {
    var diametro: Double

    do {
        print("Ingrese el diámetro de la tubería: ")
        val entrada = readLine()
        diametro = entrada?.toDoubleOrNull() ?: -1.0

        if (diametro <= 0) {
            println("Error: No se permiten valores negativos o cero. Intente de nuevo.")
        }
    } while (diametro <= 0)

    println("Valor válido ingresado: $diametro")
}
