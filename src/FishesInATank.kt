fun main(args: Array<String>) {
    var canAddFish = fitMoreFish(10.0, listOf(3, 3, 3))
    println(canAddFish.toString())

    canAddFish = fitMoreFish(8.0, listOf(2, 2, 2), hasDecorations = false)
    println(canAddFish.toString())

    canAddFish = smartFitMoreFish(9.0, listOf(1, 1, 3), 3)
    println(canAddFish.toString())

    canAddFish = smartFitMoreFish(10.0, listOf(), 7, true)
    println(canAddFish.toString())
}

//Declaring a more complex function, showcasing how to specify parameter types and default values
fun fitMoreFish(tankSize: Double, currentFish: List<Int>,
                fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    var gallons = if (hasDecorations) {
        tankSize.times(0.8)
    } else {
        tankSize
    }

    for (fish in currentFish) {
        gallons = gallons.minus(fish)
    }

    return gallons.minus(fishSize) >= 0
}

//Smarter version of the function, using the sum function to avoid programming a loop
fun smartFitMoreFish(tankSize: Double, currentFish: List<Int>,
                     fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}
