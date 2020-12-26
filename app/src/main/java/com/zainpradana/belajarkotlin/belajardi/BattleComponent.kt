package com.zainpradana.belajarkotlin.belajardi

import dagger.Component

@Component (modules = [BattleModule::class])
interface BattleComponent {
    fun inject(context: MainActivity)
}