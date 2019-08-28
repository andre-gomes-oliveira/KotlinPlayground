package buildings

/**
 * Class that represents a generic build material
 *
 * Since the minimum of any material is one, there is a property that represents it
 *
 * This will show the concept of Generics in Kotlin
 */
open class BuildingMaterial() {
    open val numberNeeded = 1

    //Creating a generic funtion that takes a building of any building material
    fun <T : BuildingMaterial> isSmallBuilding(building: Building<T>) {
        if (building.actualMaterialsNeeded > 500)
            println("This is a big building")
        else
            println("This is a small building")
    }
}

//The minimum number of Bricks will be 8
class Brick() : BuildingMaterial() {
    override val numberNeeded = 8
}

//The minimum number of Bricks will be 4
class Wood() : BuildingMaterial() {
    override val numberNeeded = 4
}