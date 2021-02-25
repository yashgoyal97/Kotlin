fun main() {
    val num = listOf(1,2,3,4,5,6)
    println("List: $num")
    println("List: ${num.size}")
    println("First element: ${num[0]}")
    println("Second element: ${num[1]}")
    println("First: ${num.first()}")
	  println("Last: ${num.last()}")
    println("Contains 4? ${num.contains(4)}")
    println("Contains 7? ${num.contains(7)}")
}
