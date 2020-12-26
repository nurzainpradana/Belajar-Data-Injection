package com.zainpradana.belajarkotlin.belajardi

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.*

@Qualifier
@MustBeDocumented
@Retention(RUNTIME)
annotation class Choose (
    val value: String = "" )