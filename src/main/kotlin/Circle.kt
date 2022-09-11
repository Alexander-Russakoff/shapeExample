import kotlin.math.abs
import kotlin.math.pow

class Circle (_name : String, _radius : Double) : Shape(_name){

    private val pi = 3.14159 //5 decimal points? Seems legit.
    private val radius = abs(_radius)

    /**
     * See abstract class Shape.
     */
    override fun getArea() : Double{
        return pi* radius.pow(2)
    }

    /**
     * See Dimensionable Interface.
     */
    override fun printDimensions() {

        val valid = if (validCircle()){
            "AM a valid Circle"
        } else {
            "am actually a Point (⌒_⌒ ; ) "
        }

        println("Hi! I am a Circle named $name!!!\nI $valid!!!\nRadius : $radius, Area : ${getArea()}")
    }
    //Circle either has a radius with some length or it doesn't. Cannot be negative because of constructor.
    private fun validCircle() : Boolean{
        if (radius == 0.0)
            return false
        return true
    }
    //We don't need these, but aren't they nice to have??
    fun getRadius(): Double{return radius}
}
