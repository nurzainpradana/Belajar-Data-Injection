package com.zainpradana.belajarkotlin.belajardi

import dagger.Component

@Component
interface BattleComponent {
    fun inject(context: MainActivity)
}