package tugas3

fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) "Genap" else "Ganjil"
}

fun main() {
    print("Masukkan bilangan: ")
    val bil = readln().toIntOrNull() ?: 0
    println("$bil merupakan bilangan ${cekGenapGanjil(bil)}")
}