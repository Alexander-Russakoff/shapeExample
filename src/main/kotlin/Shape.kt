abstract class Shape(_name : String): Dimensionable {

    val name = _name //name of shape

    /**
     * Must be overridden by child classes. That this returns anything at all is suspicious. Might be better to cast as
     * abstract function to FORCE override.
     */
    open fun getArea(): Double { return 0.0 }

}