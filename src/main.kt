import java.util.Scanner

fun random(start: Int, end: Int): Int {
    require(start <= end) {"Invalid number of sides"}
    return (start..end).random()
}
fun loaded(start: Int, end: Int, loadedNumber: Int): Int {
    var oneOfTwo: Int
    oneOfTwo = (1..2).random()
    if (oneOfTwo == 1)
        return loadedNumber
    else
        return (start..end).random()
}
fun main() {
    var numberOfDice: Int
    var sidesOnDice: Int
    var typeOfDice: Int
    var loadedNumber: Int = 0

    val dice= mutableListOf<Int>()

    val reader2 = Scanner(System.`in`)
    // Ask what type of dice they would like to roll
    println("Which type of dice would you like to roll?")
    println("(1) Regular")
    println("(2) Loaded")
    typeOfDice = reader2.nextInt()

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter number of dice: ")
    // nextInt() reads the next integer from the keyboard
    numberOfDice = reader.nextInt()

    val reader1 = Scanner(System.`in`)
    print("Enter number of sides on dice: ")
    // nextInt() reads the next integer from the keyboard
    sidesOnDice = reader1.nextInt()

    if (typeOfDice == 2) {
        val reader3 = Scanner(System.`in`)
        print("What number would you like to load: ")
        loadedNumber = reader3.nextInt()
    }


    // numberOfDice = if (readLine() != null) readLine() else throw NullPointerException("Expression 'readLine()' must not be null")

    for (i in 1..numberOfDice) {
        if (typeOfDice == 1) {
            dice.add(random(1,sidesOnDice))
        }
        else {
            dice.add(loaded(1,sidesOnDice,loadedNumber))
        }
    }
    print(dice)
}

// Input amount of dice
// output of all dice
// history of dice rolls