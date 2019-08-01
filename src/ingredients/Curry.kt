package ingredients

/**
 * Curry will be one of the possible concrete implementations of Spice
 * Since there can be multiple types of curry, this class takes a name and appens "Curry" to it
 * It also has a spiciness level that must be passed to it and a prepare function that grinds it
 */
class Curry(curry: String, spiciness: String) :
    Spice(name = "$curry Curry", spiciness = spiciness, color = YellowSpiceColor),
    Grinder {
    override fun prepareSpice() {
        grind(name)
    }
}