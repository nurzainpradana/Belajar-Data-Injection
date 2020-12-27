package com.zainpradana.belajarkotlin.belajardi

import javax.inject.Inject

class LightKnight @Inject constructor() {

    @Inject
    @field:Choose("SenjataUtama")
    lateinit var senjataUtama: Senjata

    @Inject
    @field:Choose("SenjataCadangan")
    lateinit var senjataCadangan: Senjata

//    // Membuat variabel dari class Senjata
//    private val senjata = Senjata()

    // Membuat fungsi yang mengembalikan nilai String
    fun setEquip(): String {
        return "Kelompok LightKnight Bertembur Menggunakan " + senjataUtama.pedang() + " dan " + senjataCadangan.pedang()
    }
}