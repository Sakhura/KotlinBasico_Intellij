package Estructuras

/*fun main(parametro: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
} */

/*Cargar un valor entero por teclado comprendido entre 1 y 99.
Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
*/

fun main() {
    print("Ingrese un valor entero comprendido entre 1 y 99:")
    val valor=readln().toInt()
    var cantidad = if (valor <10) 1 else 2
    println("El número $valor tiene $cantidad dígito/s")
}

/*Recuerde comentar o quitar comentario para que funcionen los códigos*/