//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    volume(10.6)
    println(isPalindrome("madam"))
    operations(arrayOf<Int>(3,3,3))

}




// num2

fun operations(array: Array<Int>):{
    for (x in array){
       println( var sum += x)
    }
}


fun operations(array: Array<Int>): Int{
    for (x in array){
        var sum += x var sum += x
    }

}



// number 3
fun volume(radius: Double){
        var pi = 3.14159
        var v = 4/3 * pi * (radius*radius*radius)
        println(v)

}



// number 4

fun isPalindrome(word: String): Boolean{
    return word == word.reversed()

}