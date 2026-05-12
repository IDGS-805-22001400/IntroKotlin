fun main() {
    val claveCorrecta = "hum123"
    var intentos = 0
    val maxIntentos = 3
    var accesoConcedido = false

    while (intentos < maxIntentos && !accesoConcedido) {
        print("Ingrese su clave de seguridad: ")
        val entrada = readLine()

        if (entrada == claveCorrecta) {
            accesoConcedido = true
            println("Acceso concedido.")
        } else 
            println("Error. Intentos restantes: ${maxIntentos - ++intentos}")
    }

    if (!accesoConcedido) {
        println("Controlador PLC bloqueado tras 3 intentos fallidos.")
    }
}