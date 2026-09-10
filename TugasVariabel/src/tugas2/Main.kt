package tugas2

fun main() {
    var a = 10
    var b = 20

    println("Sebelum ditukar:")
    println("A = $a")
    println("B = $b")

    val temp = a
    a = b
    b = temp

    println("Setelah ditukar:")
    println("A = $a")
    println("B = $b")
}