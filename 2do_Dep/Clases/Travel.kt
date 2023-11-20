package Clases

class Travel {
    protected val country:String
    protected val city : String
    protected val serviceType : "Viaje"
    protected val reserved = false
    protected val paidAmount = 0

    abstract fun quotePrice()
    protected abstract fun gatPrice(numDays:Int)
    fun reserve (numDays:Int){
        if (reserved){
            println("")
        }
    }
}