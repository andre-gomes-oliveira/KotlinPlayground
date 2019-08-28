package buildings

/**
 * A class that shows the usage of generics in Knotlin
 *
 * Including the keyword out, used to denote the generic to be returned from a function
 * This helps the compiler to check for proper usage of the concrete instance of the generic object
 */
open class Building<out T : BuildingMaterial>(private val material: T) {

    //The minimum number of total materials any Building would need
    var baseMaterialsNeeded = 100

    //using the baseMaterialsNeeded and the material type to calculate the actual number of materials needed
    var actualMaterialsNeeded = baseMaterialsNeeded.times(material.numberNeeded)

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} are necessary to build this Building")

    }
}