fun main() {
    var carga = 0
    var minutos = 0

    while (carga < 100) {
        minutos++
        carga += 15
        
        println("Minuto $minutos: Carga actual = $carga%")
    }

    println("Ciclo detenido. Carga final: $carga%. Proceso terminado en $minutos minutos.")
}