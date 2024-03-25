//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var numbers = arrayOf<Int>(1, 2, 3, 4, 5)
    var (sum, count, average) = calculateStats(numbers)
    println("Sum: $sum, Count: $count, Average: $average")
    printWithoutB("Barnie bakes brown bagels and buns")
    volume(10.6)
    println(isPalindrome("madam"))


}


// num1
fun printWithoutB(input: String) {
    var words = input.split(" ")
    for (word in words) {
        var filteredWord = word.replace("b", "")
        println(filteredWord)
    }
}


// num2
fun calculateStats(numbers: Array<Int>): Triple<Int, Int, Double> {
    val sum = numbers.sum()
    val count = numbers.size
    val average = sum.toDouble() / count
    return Triple(sum, count, average)
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

