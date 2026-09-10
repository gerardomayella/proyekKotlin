package tugas2

fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main() {
    val p = 10.0
    val l = 5.0
    val luas = hitungLuas(p, l)

    println("Panjang : ${p.toInt()}")
    println("Lebar   : ${l.toInt()}")
    println("Luas    : ${luas.toInt()}")
}