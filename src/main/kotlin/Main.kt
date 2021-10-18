import java.io.File

//Q1 :

fun main() {

//Create a list of 3 elements
    var favoriteCite = mutableListOf("Riyadh ", "Jeddah ", " albaha")
    println(favoriteCite)
     //add more 2 elements
    favoriteCite.addAll(2,listOf("yanbu","damam"))
     println(favoriteCite)
   // update last element finally print the whole list with the numbers
    favoriteCite[4]="abha"
   for (index in 0 until favoriteCite.size ){

       println("$index - ${favoriteCite[index]}")

   }


    }



//OPTIONS-Create a text file and read it:
    // var numList = File("data/numList.txt").readText().split("/n") // idk where is the error , cause i writed it correctly????
  // println(numList) //



