
fun main() {

    // 1.Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo
    // R: Se le asigna un double

    // 2.Volver flotante a la variable decimal
    val decimal: Float = 5f //Valor del radio

    // 3.Declarar una variable const val con el valor de PI
    //   y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    val PI = 3.14159265359 // Valor de PI

    val perimetro = PI*(2*decimal) // Cálculo del perímetro

    println("El perímetro del círculo es: $perimetro")
}