package Clases

class Vehicule {
    init {
        println("Veiculo Crado")
    }
    companion object Factory {
        fun create(): Vehicule = Vehicule()
    }
}