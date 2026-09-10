package tugas2

fun main() {
    print("Masukkan suhu dalam Celsius: ")
    val celsius: Double = readln().toDoubleOrNull() ?: 0.0

    val fahrenheit: Double = (celsius * 9 / 5) + 32
    val kelvin: Double = celsius + 273.15

    println("Fahrenheit = $fahrenheit")
    println("Kelvin     = $kelvin")
}

















