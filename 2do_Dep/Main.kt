import Clases.*


// Vehiculo
/*
fun main(){

    // Crear una instancia de Vehiculo
    val miVehiculo = Vehiculo("Ford", "Focus", "verde", "REM-4123")
    miVehiculo.placas = "REM-4123"

    // Verificar si el coche está encendido antes y después de manipularlo
    println("El coche está encendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está encendido? ${miVehiculo.encendido}")

    // Recargar el tanque y verificar la cantidad de gasolina
    miVehiculo.recargar(20.07f)
    println("El tanque tiene ${miVehiculo.gasolina} litros")

    // Crear otras instancias de Vehiculo
    val golNegro = Vehiculo("Volkswagen", "Gol")
    val pointer = Vehiculo(
        marca = "Volkswagen",
        modelo = "Pointer",
        color = "azul"
    )

    // Imprimir información sobre los otros vehículos
    println("Gol Negro - Color: ${golNegro.color}, Marca: ${golNegro.marca}, Modelo: ${golNegro.modelo}")
    println("Pointer - Color: ${pointer.color}, Marca: ${pointer.marca}, Modelo: ${pointer.modelo}")
}
*/


// Mario
/*
fun main(){

// Crear una instancia de Mario
var mario = Mario()

// Simular colisiones con Pipe y Goomba y mostrar vidas restantes
mario.collision("Pipe")
mario.collision("Goomba")

// Simular más colisiones con Goomba y mostrar vidas restantes en un bucle
for (i in 1..5) {
    mario.collision("Goomba")
    println("Te quedan ${mario.getLives()}")
}

// Crear instancias de Koopa
val koopa = Koopa()

// Simular colisión con Koopa
koopa.collision("Weapon")

// Simular más interacciones con Koopa
mario.collision("Goomba")
koopa.collision("Enemy")
println("Te quedan ${mario.getLives()}")
}
*/


// Viaje
/*
fun main(){
        val viajeMonterrey = National("Monterrey")
        viajeMonterrey.quotePrice(2)
        viajeMonterrey.reserve(2)

        val viajeBajaMonterrey = NationalLowSeason("Monterrey")
        viajeBajaMonterrey.quotePrice(4)
        viajeBajaMonterrey.reserve(4)
}
*/


// Movie
/*
fun main() {
    val scaryMovie = Movie("Scary movie", "Comedia", 88.27)

    // Descomenta las líneas según tus necesidades
    // println(scaryMovie)
    // println(scaryMovie.name)
    // println(scaryMovie.name)
    // println("Fecha de creacion ${scaryMovie.createAt}")

    println(scaryMovie.component2())

    val (nameDeS, genderS, durationS) = scaryMovie
    println("Duracion: $durationS, Name: $nameDeS, Genero: $genderS")

    val scaryMovie2 = scaryMovie.copy(name = "Scary movie 2", duration = 83.0)
    println("""
        Scary movie: $scaryMovie
        Scary movie 2: $scaryMovie2
        '"'.trimIndent()
    )
}
*/