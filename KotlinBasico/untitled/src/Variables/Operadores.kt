package Variables

fun main() {
    val a = 400
    val b = 25

    val suma = a + b
    println("El resultado de la suma es " + suma)
    val resta = a - b
    println("El resultado de la resta es " + resta)
    val multiplicacion = a * b
    println("El resultado de la multiplicacion es " + multiplicacion)
    val division = a / b
    println("El resultado de la division es " + division)

    var c = 5
    c += 3 // Esto nos dara un resultado que c = c + 3


    //Operadores relacionales
    val d = 5
    val e = 8
    val esMayor = d > e
    val esMenor = d < e
    val esIgual = d == e
    val noEsIgual = d != e

    //Operadores Lógicos
    val esVerdadero = true
    val esFalso = false

    val yLogico = esVerdadero && esFalso
    val oLogico = esVerdadero || esFalso
    val noLogico = !esVerdadero
}