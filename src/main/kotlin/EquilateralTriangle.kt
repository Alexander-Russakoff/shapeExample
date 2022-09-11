class EquilateralTriangle(_name: String, _side : Double) : Triangle (_name,_side,_side,_side) {


    override fun printDimensions(){

        val valid : String = if (validTriangle()) {
            "AM"
        } else {
            "am NOT"
        }

        println("Hi! I am an Equilateral Triangle named $name!\n" +
                "I $valid a valid Equilateral Triangle!!!\n" +
                "Side a : $a Side b : $b Side c : $c\nArea : ${getArea()}")
    }
    //This is always true, so why waste compute??
    override fun checkEquilateral() : Boolean {
        return true
    }
    //Similarly, much simpler question.
    override fun validTriangle() : Boolean {
        if (a == 0.0)
            return false
        return true
    }
    //We don't need these, but aren't they nice to have??
    fun getSide():Double{return a} //overloaded getSide() function, only relevant for equilateral triangle.
}