import kotlin.math.abs

open class Triangle(_name : String, _a: Double, _b: Double, _c : Double ) : Shape(_name) {

    private val a = abs(_a)
    private val b = abs(_b)
    private val c = abs(_c)

    override fun printDimensions(){

        val valid : String = if (validTriangle()) {
            "a"
        } else {
            "not a"
        }

        val equilateral : String = if (checkEquilateral()){
            "am"
        } else {
            "am not"
        }

        println("Hi! I am a Triangle named $name!\nI am $valid Valid Triangle!!!\n" +
                "I $equilateral an Equilateral Triangle!!!" +
                "\nSide a : $a Side b : $b Side c : $c\nArea : ${getArea()}")

    }

    override fun getArea(): Double {
        val s = 0.5 * getPerimeter()
        return kotlin.math.sqrt(s * (s - a) * (s - b) * (s - c) )
    }

    protected open fun checkEquilateral() : Boolean {

        return ( (a==b) && (b == c) )
    }

    private fun getPerimeter(): Double {

        return (a + b + c)

    }
        private fun validTriangle(): Boolean {
        return (
        ((a + b) > c)
                &&
        ((a + c) > b )
                &&
        ((b + c) > a)
        )
        }

}
