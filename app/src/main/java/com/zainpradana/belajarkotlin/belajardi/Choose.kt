package com.zainpradana.belajarkotlin.belajardi

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Choose (
    val value: String = "" )