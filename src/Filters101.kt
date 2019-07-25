/**
 * A series of small exercies to work with lists while testing the filter function
 */
fun main() {
    //First create a list of spices to work with
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    //Then, use a filter to print only the curries
    println("Curries: " + spices.filter { it.contains("curry") })

    //The original list is unchanged
    println("Original list: $spices")

    //Next step, get only the curries and sort them alphabetically
    println("Sorted curries - alphabetically: " + spices.sorted().filter { it.contains("curry") })

    //Next step, get only the curries and sort by length
    println("Sorted curries - length: " + spices.filter { it.contains("curry") }.sortedBy { it.length })

    //Next step, get only the spices that start with a c and end with an e
    println("Starts with a c and ends with and e: " + spices.filter { it.startsWith("c") }.filter { it.endsWith("e") })
    println("Starts with a c and ends with and e 2: " + spices.filter { it.startsWith("c") && it.endsWith("e") })

    //Last exercise, reduce the list to 3 elements and get the ones that start with a c
    println("first 3 starting with a c" + spices.take(3).filter { it.startsWith('c') })


}
