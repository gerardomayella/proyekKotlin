package tugas3

fun main() {
    print("Masukkan bilangan desimal: ")
    val inputString: String = readln()
    val nilaiDouble: Double = inputString.toDoubleOrNull() ?: 0.0
    val nilaiInt: Int = nilaiDouble.toInt()
    val nilaiString: String = nilaiDouble.toString()

    println("Nilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiString")
}