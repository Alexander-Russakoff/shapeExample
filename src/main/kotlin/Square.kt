import kotlin.math.abs

class Square(_name : String, _length : Double, _width : Double): Shape (_name){

    private val length = abs(_length)
    private val width = abs(_width)

    override fun printDimensions() {
        val valid = if (validSquare()){
            "a valid square"
        } else {
            "actually a rectangle"
        }
        println("Hi! I am a square named: $name!!!\nI am $valid!!!\nLength : $length, Width : $width, Area : ${getArea()}")
    }

    override fun getArea(): Double {
        return length * width
    }

    private fun validSquare(): Boolean{
        return (length == width)
    }
}