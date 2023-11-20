package Clases

class Mario (var vidas: Int =3){ //vamos a dejar satear el numero de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //Vamo a hacer que Mario se presente al costruirlo
    }

    private var state = "small" // Mario es pequeño al iniciar el juego
    private  var lives = 3 // Uno enpieza con tres vidas

        set(value) {
            if(field == 1){
               field = 0
               gameOver()
            } else if (field==0){
                println("Nesesitas volver a jugar")
            }
            else{
                field=value
            }
        }

    private fun gameOver(){
        println("El juego a TERMINADO")
    }

    val isAlive: Boolean
        get() {
            return lives>=1
        }

    private fun die(){
        lives--
        println("Has perdido un vida")
    }

    // El modificador public es redundante
    // En funcion del objeto colisionaste, se ejecuta un evento

    public fun collision (collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
                "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            else -> println("Objeto desconosido ¡no pasa nada!")
        }
    }

    fun getLives() : String{
        return "$lives Vidas"
    }
}