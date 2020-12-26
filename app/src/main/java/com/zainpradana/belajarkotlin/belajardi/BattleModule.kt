package com.zainpradana.belajarkotlin.belajardi

import dagger.Module
import dagger.Provides

@Module
class BattleModule {

    // Menyediakan Dependency yang akan digunakan dengan parameter didalam Class Senjata
    @Provides
    fun setSenjata(): Senjata {
        return Senjata("Pedang larva", "Tombak halilintar")
    }

    @Provides
    fun SenjataCadangan(): Senjata {
        return Senjata("Pedang Nama", "Tombak Golem")
    }
}