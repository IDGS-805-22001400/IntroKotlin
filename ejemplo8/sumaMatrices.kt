fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("Ingresa los valores de la primera matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
            print("matriz1[$i][$j]: ")
            matriz1[i][j] = readLine()?.toInt() ?: 0
        }
    }

    println("\nIngresa los valores de la segunda matriz (3x3):")
    for (i in 0..2) {
        for (j in 0..2) {
            print("matriz2[$i][$j]: ")
            matriz2[i][j] = readLine()?.toInt() ?: 0
        }
    }

    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nLa matriz resultante es:")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]} \t")
        }
        println()
    }
}