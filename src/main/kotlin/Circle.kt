import kotlin.math.abs
import kotlin.math.pow

class Circle (_name : String, _radius : Double) : Shape(_name){
    val pi = 3.14159
    val radius = abs(_radius)

    override fun getArea() : Double{
        return pi* radius.pow(2)
    }

    override fun printDimensions() {
        println("I am a circle named $name!!!\nRadius : $radius, Area : ${getArea()}")
    }
}
