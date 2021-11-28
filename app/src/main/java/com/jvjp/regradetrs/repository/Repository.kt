package com.jvjp.regradetrs.repository

class Repository {

    fun calcularSimples(a: Double, b: Double, c: Double) = (b * c) / a

    fun calcularCompostas(a: Double, b: Double, c: Double, d: Double, e: Double) = (e * (b*d)) / (a*c)

}