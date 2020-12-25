package com.zainpradana.belajarkotlin.belajardi

class LightKnight(private val senjata: Senjata) {

//    // Membuat variabel dari class Senjata
//    private val senjata = Senjata()

    // Membuat fungsi yang mengembalikan nilai String
    fun setEquip(): String {
        return "Kelompok LightKnight Bertembur Menggunakan " + senjata.pedang()
    }
}