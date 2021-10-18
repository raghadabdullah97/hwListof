

//OPTIONS-Create a list of 10 number then return the maximum number
fun main() {

   println("list of 10 number : ")
    var listOf10 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listOf10)
    println("bigesst number is : " +listOf10.maxOf { it }) //

}




