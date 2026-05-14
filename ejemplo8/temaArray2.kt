fun main(parametro: Array<String>) {
    val alturas = FloatArray(5)
    var suma = 0f
    for(i in 0..alturas.size-1){
        print("Ingrese la altura: ")
        alturas[i] = readln().toFloat()
        suma += alturas[i]
    }
    val promedio = suma / alturas.size
    println("Altura promedio: $promedio")
    var altos = 0
    var bajos = 0
    for(i in 0..alturas.size-1)
        if (alturas[i] > promedio)
        altos++
        else
        bajos++
    println("Cantidad de personas más altas que el promedio: $altos")
    println("Cantidad de personas más bajas que el promedio: $bajos")
}

/*
-- Suma de dos matrices 3x3 en kotlin --
Crear un programa que permita al usuario ingresar por teclado los valores de dos matrices de tamaño
3x3 y posteriormente realiza la suma de ambas mastrices, mostrando el resultado en pantalla.

-- Explicación del programa --
Se crean tres matrices:
matriz1 para almacenar la primera matriz,
matriz2 para almacenar la segunda matriz,
resultado para guardar la suma
*/