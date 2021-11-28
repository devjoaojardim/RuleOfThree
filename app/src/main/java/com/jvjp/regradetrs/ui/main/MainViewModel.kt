package com.jvjp.regradetrs.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jvjp.regradetrs.repository.Repository
import java.text.DecimalFormat

class MainViewModel : ViewModel() {
    private var repository = Repository()

    private var mResultado = MutableLiveData<String>()
    var resultado = mResultado

    init {
        mResultado.value = "X"
    }
    fun calcular(a: String, b: String, c: String) {

        val caixa_a = a
        val caixa_b = b
        val caixa_c = c

        val valor_a = caixa_a.toDouble()
        val valor_b = caixa_b.toDouble()
        val valor_c = caixa_c.toDouble()

        val result = repository.calcularSimples(valor_a, valor_b, valor_c)
        //Corrigir a saida do numero decimal
        val df = DecimalFormat("#,###.00")
        mResultado.value = df.format(result).toString()


    }
}