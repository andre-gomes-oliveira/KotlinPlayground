package ingredients

/**
, A singleton used for the yellow color, it can be given to any Spice
 */
object YellowSpiceColor : SpiceColor {
    override val color: String
        get() = "Yellow"
}