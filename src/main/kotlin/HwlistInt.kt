//Q2 :


fun main() {

    ////Create a list of integer with 5 elements
    var num = mutableListOf(1 , 2 , 3 , 4 , 5 )
    println(num)
    //update the 3th element to 12
    num[4]=12
    println(num)
    // the pointer now on index 12
    println(num.indexOf(12))
    // delet 12
    num.removeAt(3 )
    println(num)





}