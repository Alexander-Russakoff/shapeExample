import kotlin.math.abs

open class Triangle(_name : String, _a: Double, _b: Double, _c : Double ) : Shape(_name) {

    protected val a = abs(_a) //protected so EquilateralTriangle has access
    protected val b = abs(_b)
    protected val c = abs(_c)

    /**
     * See Dimensionable interface.
     */
    override fun printDimensions(){

        val valid : String = if (validTriangle()) {
            "AM"
        } else {
            "am NOT"
        }

        val equilateral : String = if (checkEquilateral()){
            "AM an Equilateral Triangle (∗´ `) "
        } else {
            "am NOT an Equilateral Triangle"
        }

        println("Hi! I am a Triangle named $name!\nI $valid a valid Triangle!!!\n" +
                "I $equilateral!!!" +
                "\nSide a : $a Side b : $b Side c : $c\nArea : ${getArea()}")
    }

    /**
     * See abstract class Shape.
     */
    override fun getArea(): Double {
        val s = 0.5 * getPerimeter()
        return kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c) )
    }

    //Are all sides equal?
    protected open fun checkEquilateral() : Boolean {
        return ( (a==b) && (b == c) )
    }
    //What is my perimeter
    private fun getPerimeter(): Double {
        return (a + b + c)
    }

    //Just because the user thinks I'm a triangle, doesn't mean I'm really a triangle
    protected open fun validTriangle(): Boolean {

        if (a == 0.0 || b == 0.0 || c == 0.0)
            return false

        return (
            ((a + b) > c)
                &&
            ((a + c) > b )
                &&
            ((b + c) > a)
            )
        }

    //We don't need these, but aren't they nice to have??
    fun getSides():List<Double>{return listOf(a,b,c)}
    fun getSide(_side : Char):Double{
        return when(_side){
            'a' -> a
            'b' -> b
            'c' -> c
            else -> throw IllegalArgumentException("Side must be a, b, or c.")
        }

    }

}
