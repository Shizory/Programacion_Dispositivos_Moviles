package Clases

open class Enemy(val name:String, val strength:Int) {

    init {
        println("Iniciando superclase de $name")
    }

    protected var direction:String = "LEFT"

    protected fun changeDireccion(){
        direction = if(direction=="RIGHT") "LEFT" else "RIGHT"
        println("$name va en dirección $direction")
    }

    protected fun die(){
        println("$name ha muerto")
    }

    open fun collision(collider:String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDireccion()
        }
    }
}