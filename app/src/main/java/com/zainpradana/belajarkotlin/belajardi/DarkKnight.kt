package com.zainpradana.belajarkotlin.belajardi

import javax.inject.Inject

class DarkKnight @Inject constructor() {

    @Inject
    @field:Choose("SenjataUtama")
    lateinit var senjataUtama: Senjata

    @Inject
    @field:Choose("SenjataCadangan")
    lateinit var senjataCadangan: Senjata

//    //membuat Objek Variabel dari class Senjata
//    private val senjata = Senjata()

    //Membuat fungsi yang mengembalikan nilai string
    fun setEquip(): String {
        return "Kelompok DarkKnight bertempur menggunakan " + senjataUtama.tombak() + " dan " + senjataCadangan.tombak()
    }
}