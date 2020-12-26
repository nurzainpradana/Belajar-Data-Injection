package com.zainpradana.belajarkotlin.belajardi

import javax.inject.Inject

class DarkKnight @Inject constructor(val senjata: Senjata) {

//    //membuat Objek Variabel dari class Senjata
//    private val senjata = Senjata()

    //Membuat fungsi yang mengembalikan nilai string
    fun setEquip(): String {
        return "Kelompok DarkKnight bertempur menggunakan " + senjata.tombak()
    }
}