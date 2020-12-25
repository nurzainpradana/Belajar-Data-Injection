package com.zainpradana.belajarkotlin.belajardi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zainpradana.belajarkotlin.belajardi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        // Membuat Instance atau Object dari class LightKnight NightKnigth
        val lightKnight = LightKnight()
        val darkKnight = DarkKnight()

        // Menambahkan listener pada button
        binding.clickMe.setOnClickListener{
            // Menampilkan Data pada TextView yang diambil dari fungsi setEquip dari kedua class tsb
            val getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip()
            binding.report.text = getReport
        }

    }
}