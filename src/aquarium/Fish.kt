package aquarium

/**
 * Declaring an auxiliary class
 * Note that, since the volumeNeeded parameter does not have a val or var keyword it will not be an attribute of this class
 */
class Fish(private val isFriendly: Boolean = true, volumeNeeded: Int) {

    private val size: Int = if (isFriendly)
        volumeNeeded
    else
        volumeNeeded * 2

    /**
     * Good Kotlin classes should only have one constructor and either use init blocks or helper function
     * These two function below are interchangeable, but the second is preferred
     */
    constructor() : this(isFriendly = true, volumeNeeded = 50)

    fun createDefaultFish() = Fish(isFriendly = true, volumeNeeded = 50)

    fun checkFish() {
        println(
            "Is this fish friedly? $isFriendly \n" +
                    "How much space does it require?: $size \n"
        )
    }
}