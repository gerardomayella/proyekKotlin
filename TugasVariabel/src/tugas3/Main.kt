package tugas3

fun main() {
    val namaBarang = "Mouse Vertikal"
    val harga = 250000.0
    val jumlah = 2
    val diskon = 10.0

    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println("Barang      : $namaBarang")
    println("Subtotal    : Rp $subtotal")
    println("Potongan    : Rp $potongan")
    println("Total bayar : Rp $totalBayar")
}