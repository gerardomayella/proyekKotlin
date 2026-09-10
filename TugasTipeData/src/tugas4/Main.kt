package tugas4

fun main() {
    val PI: Double = 3.14159
    print("Masukkan jari-jari lingkaran: ")
    val r: Double = readln().toDoubleOrNull() ?: 0.0

    val luas: Double = PI * r * r
    val keliling: Double = 2 * PI * r

    println("Luas     = $luas")
    println("Keliling = $keliling")
}