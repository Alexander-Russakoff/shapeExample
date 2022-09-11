import java.lang.NumberFormatException

fun main() {
    /**
     * The following helper functions come directly from the kotlin.org docs.
     * They have been modified to accept type Double, where previously the type was Int.
     **/
    fun readLn() = readLine()!! // string line
    fun readDouble() = readLn().toDouble() // single double
    fun readStrings() = readLn().split(" ") // list of strings
    fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles
    /**
     * The following helper functions are designed to recursively attempt to retrieve numeric inputs from the user.
     * If the format is wrong of the values passed cannot be interpreted as type Double, the function will
     * prompt to try again then call itself.
     */
    fun getTriangleSides(): List<Double> {
        println("Please give 3 side lengths for a triangle (three numbers seperated by a space, such as: \"3 4 5\".")
        return try {
            return readDoubles()
        } catch (e: NumberFormatException) {
            println("Please try again.")
            getTriangleSides()
        }
    }

    fun getEquilateralSide(): Double {
        println("Please give a side length for your equilateral triangle.")
        return try {
            return readDouble()
        } catch (e: NumberFormatException) {
            println("Please try again.")
            getEquilateralSide()
        }
    }

    fun getCircleRadius(): Double {
        println("Please give a radius for your circle.")
        return try {
            return readDouble()
        } catch (e: NumberFormatException) {
            println("Please try again.")
            getEquilateralSide()
        }
    }

    fun getSquareSides(): List<Double> {
        return try {
            println("Please give a length for your square.")
            val length = readDouble()
            println("Please give a width for your square.")
            val width = readDouble()
            return listOf(length, width)
        } catch (e: NumberFormatException) {
            println("Please try again.")
            getSquareSides()
        }
    }

    /**
     * Begin assignment main.
     */
    //Ambiguous Shape declarations
    val triangle: Shape
    val equilateral : Shape
    val square : Shape
    val circle : Shape
    //Gather input from user and initialize Shape to type Triangle
    println("Please name your triangle :).")
    val triangleName : String = readLine()!!
    val triangleSides = getTriangleSides()
    triangle = Triangle(triangleName,triangleSides[0],triangleSides[1],triangleSides[2])
    //Initialize Shape to type EquilateralTriangle
    println("Please name your equilateral triangle :).")
    val equilateralName : String = readLine()!!
    val equilateralSide = getEquilateralSide()
    equilateral = EquilateralTriangle(equilateralName,equilateralSide)
    //Initialize Shape to type Square
    println("Please name your square :).")
    val squareName : String = readLine()!!
    val squareSides = getSquareSides()
    square = Square(squareName,squareSides[0],squareSides[1])
    //Initialize Shape to type Circle
    println("Please name your circle :).")
    val circleName : String = readLine()!!
    val circleRadius = getCircleRadius()
    circle = Circle(circleName,circleRadius)

    // Let's print out the values of the shapes!
    //This formatting could probably be much more clever, however I get weird behavior when trying to use \n.
    println("")
    println("")
    triangle.printDimensions()
    println("")
    println("")
    equilateral.printDimensions()
    println("")
    println("")
    square.printDimensions()
    println("")
    println("")
    circle.printDimensions()

}