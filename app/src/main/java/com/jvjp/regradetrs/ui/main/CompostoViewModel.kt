package com.jvjp.regradetrs.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jvjp.regradetrs.repository.Repository
import java.text.DecimalFormat

class CompostoViewModel : ViewModel() {
    private var repository = Repository()

    private var mResultado = MutableLiveData<String>()
    var resultado = mResultado

    init {
        mResultado.value = "X"
    }
    fun calcularComposto(a: String, b: String, c: String, d: String, e: String) {

        val caixa_a = a
        val caixa_b = b
        val caixa_c = c
        val caixa_d = d
        val caixa_e = e

        val valor_a = caixa_a.toDouble()
        val valor_b = caixa_b.toDouble()
        val valor_c = caixa_c.toDouble()
        val valor_d = caixa_d.toDouble()
        val valor_e = caixa_e.toDouble()

        val result = repository.calcularCompostas(valor_a, valor_b, valor_c, valor_d, valor_e)
        val df = DecimalFormat("#,###.00")

        //Corrigir a saida do numero decimal
        mResultado.value = df.format(result).toString()


    }
}