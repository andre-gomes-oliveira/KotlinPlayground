package buildings

fun main() {
    //The building materials
    val wood = Wood()
    val brick = Brick()

    //The buildings
    val house = Building(wood)
    val brickHouse = Building(brick)

    //Using the generic functions to check how many materials will be needed to build these buildings
    house.build()
    wood.isSmallBuilding(house)

    brickHouse.build()
    brick.isSmallBuilding(brickHouse)
}