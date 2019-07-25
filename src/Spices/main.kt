package Spices

fun main() {
    tasteSpices()
}

fun tasteSpices() {
    val spice = SimpleSpice()

    println(
        "Spice name: ${spice.name} \n" +
                "Spiciness: ${spice.heat()}"
    )
}
