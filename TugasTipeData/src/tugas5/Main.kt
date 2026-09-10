package tugas5

fun main() {
    print("Masukkan karakter: ")
    val input = readln()
    if (input.isNotEmpty()) {
        val karakter: Char = input.first()

        println("Karakter       : $karakter")
        println("Kode karakter  : ${karakter.code}")
        println("Termasuk huruf : ${karakter.isLetter()}")
        println("Termasuk angka : ${karakter.isDigit()}")
    } else {
        println("Input kosong!")
    }
}