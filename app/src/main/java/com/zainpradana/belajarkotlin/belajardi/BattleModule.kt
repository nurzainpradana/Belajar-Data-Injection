package com.zainpradana.belajarkotlin.belajardi

import dagger.Module
import dagger.Provides

@Module
internal object BattleModule {

    // Menyediakan Dependency yang akan digunakan dengan parameter didalam Class Senjata
    @Provides
    @Choose("SenjataUtama")
    fun setSenjata(): Senjata {
        return Senjata("Pedang larva", "Tombak halilintar")
    }

    @Provides
    @Choose("SenjataCadangan")
    fun setSenjataCadangan(): Senjata {
        return Senjata("Pedang Nama", "Tombak Golem")
    }
}