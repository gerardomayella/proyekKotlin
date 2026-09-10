package tugas5

fun tambah(a: Double, b: Double): Double = a + b
fun kurang(a: Double, b: Double): Double = a - b
fun kali(a: Double, b: Double): Double = a * b
fun bagi(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Kesalahan: Pembagian dengan nol tidak diizinkan.")
    }
    return a / b
}

fun main() {
    println("=== Kalkulator Sederhana ===")
    println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian")
    print("Pilih operasi (1/2/3/4): ")
    val pilihan = readln()

    print("Masukkan angka pertama: ")
    val num1 = readln().toDoubleOrNull() ?: 0.0
    print("Masukkan angka kedua: ")
    val num2 = readln().toDoubleOrNull() ?: 0.0

    try {
        val hasil = when (pilihan) {
            "1" -> tambah(num1, num2)
            "2" -> kurang(num1, num2)
            "3" -> kali(num1, num2)
            "4" -> bagi(num1, num2)
            else -> {
                println("Pilihan tidak valid.")
                return
            }
        }
        println("Hasil: $hasil")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}