fun main()
{
    println("Ingrese el sueldo del empleado")
    val sueldo = readln().toDouble()
    if(sueldo > 300){
        println("Paga In puestos")
    }
    else
        println("No paga Impuestos")

        /*
        >, <, <=, >=, ==, !=

        +, -, *, /,
        */

        val a = 3
        val b = 5

        val mayor = if (a > b) a else b
        println("El numero mayor entre $a y $b es $mayor")
}