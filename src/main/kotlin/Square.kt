import kotlin.math.abs

class Square(_name : String, _length : Double, _width : Double): Shape (_name){

    private val length = abs(_length)
    private val width = abs(_width)

    override fun printDimensions() {
        val valid : String = if (validSquare()){ //in real life, these would all be functions or not a valid construction
            "AM a valid Square"
        } else if (length > 0 && width > 0){
            "am actually a Rectangle >;) "
        } else if ( (length == 0.0 || width == 0.0) && length!=width ) {
            "am actually a line >;) "
        } else {
            "am actually a point >;) "
        }
        println("Hi! I am a Square named $name!!!\nI $valid!!!\nLength : $length, Width : $width, Area : ${getArea()}")
    }
    //Get area of square. Can be zero is square is line or point.
    override fun getArea(): Double {
        return length * width
    }
    //Check if square is really a square.
    private fun validSquare(): Boolean{
        if (length == 0.0 || width == 0.0)
            return false
        return (length == width)
    }
    //We don't need these, but aren't they nice to have??
    fun getLength():Double{return length}
    fun getWidth():Double{return width}

}