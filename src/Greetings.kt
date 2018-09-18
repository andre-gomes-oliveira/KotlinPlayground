fun main(args: Array<String>)
{
    //Deciding weather to say good day or good night based on the args
    println( if(args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}
