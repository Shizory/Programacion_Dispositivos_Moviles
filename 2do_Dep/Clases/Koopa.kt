package Clases

class Koopa:
    Enemy("Koopa",2) {

        override fun collision(collider:String){
            /*super.collision(collider)
            println("Usando la colision de la clase enemy")*/
            when{collider}{
                "Weapon" -> {
                    state = "Shell"
                println("El estado es ahora $state")
            }"Enemy" -> changeDirection()
            }
        }
    }