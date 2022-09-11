class EquilateralTriangle(_name: String, _side : Double) : Triangle (_name,_side,_side,_side) {

    override fun checkEquilateral() : Boolean {
        return true
    }

}