package Estructuras


/*Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.*/

fun main(parametro: Array<String>) {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
    }
}