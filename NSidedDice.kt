fun main() {
    val myFirstDice = Dice(6,"Green")
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided, ${myFirstDice.color} color dice rolled ${diceRoll}!")
    
    val mySecondDice = Dice(20,"Red")
    println("Your ${mySecondDice.numSides} sided, ${mySecondDice.color} color dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int, val color: String) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
