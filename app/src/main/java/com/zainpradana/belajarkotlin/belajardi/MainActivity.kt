package com.zainpradana.belajarkotlin.belajardi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zainpradana.belajarkotlin.belajardi.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Deklarasi Variable dengan menggunakan Anotasi Project
    @Inject lateinit var darkKnight: DarkKnight
    @Inject lateinit var lightKnight: LightKnight

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        // Membuat Object dari Class Senjata
//        val senjata = Senjata("Pedang Api", "Tombak Petir")

        // Membuat Instance atau Object dari class LightKnight NightKnigth
//        val lightKnight = LightKnight(senjata)
//        val darkKnight = DarkKnight(senjata)

        // Menambahkan listener pada button
//        binding.clickMe.setOnClickListener{
            // Menampilkan Data pada TextView yang diambil dari fungsi setEquip dari kedua class tsb
//            val getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip()
//            binding.report.text = getReport
//        }

        // Menggunakan Library Dagger 2

        // Mendapatkan Konteks dari class yang bersangkutan
        DaggerBattleComponent.create().inject(this)


        // Listener pada button
        binding.clickMe.setOnClickListener{
            // Menampilkan data pada TextView yang diambil dari Fungsi setEquip dari kedua class tersebut
            val getReport = lightKnight!!.setEquip() + " dan " + darkKnight!!.setEquip()
            binding.report.text = getReport
        }

    }
}