import java.lang.NumberFormatException

fun main() {

    fun readLn() = readLine()!! // string line
    fun readDouble() = readLn().toDouble() // single double
    fun readStrings() = readLn().split(" ") // list of strings
    fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles

    fun getTriangleSides(): List<Double> {
        println("Please give 3 side lengths for a triangle (three numbers seperated by a space, such as: \"1 3 5\".")
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


    val triangle: Shape
    val equilateral : Shape
    val square : Shape
    val circle : Shape

    println("Please name your triangle :).")
    val triangleName : String = readLine()!!
    val triangleSides = getTriangleSides()
    triangle = Triangle(triangleName,triangleSides[0],triangleSides[1],triangleSides[2])

    println("Please name your equilateral triangle :).")
    val equilateralName : String = readLine()!!
    val equilateralSide = getEquilateralSide()
    equilateral = EquilateralTriangle(equilateralName,equilateralSide)

    println("Please name your square :).")
    val squareName : String = readLine()!!
    val squareSides = getSquareSides()
    square = Square(squareName,squareSides[0],squareSides[1])

    println("Please name your circle :).")
    val circleName : String = readLine()!!
    val circleRadius = getCircleRadius()
    circle = Circle(circleName,circleRadius)


    triangle.printDimensions()
    println()
    equilateral.printDimensions()
    println()
    square.printDimensions()
    println()
    circle.printDimensions()
    println()

}