package game

// Defining the directions that character can go to in the game
enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game() {

    
    //The initial path
    var path = mutableListOf(Directions.START)

    // Lambdas that will add directions walked to the path
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    //Ending the game, printing the final path and starting over
    val end = {
        path.add(Directions.END)
        println("GAME OVER! $path")
        path.clear()
        false
    }

    //Creating a higher-order function that takes a lambda as an argument and calls it
    fun move(where: () -> Boolean) {
        where()
    }

    //A function that receives a string and calls the higher-order function with the appropriate move
    fun makeMove(move: String?): Unit? {
        when (move) {
            null -> move(end)
            "n", "north" -> move(north)
            "s", "south" -> move(south)
            "e", "east" -> move(east)
            "w", "west" -> move(west)
            else -> move(end)
        }

        return null
    }
}

//Creating an extended function on a list that returns any number divisible by 3
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    /*
    //Basic game test

    val game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
*/

    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}
