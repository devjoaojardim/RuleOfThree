package com.jvjp.regradetrs.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.jvjp.regradetrs.R
import kotlinx.android.synthetic.main.composto_fragment.*
import kotlinx.android.synthetic.main.main_fragment.*

class CompostoFragment : Fragment() {

    companion object {
        fun newInstance() = CompostoFragment()
    }

    private lateinit var viewModel: CompostoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.composto_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CompostoViewModel::class.java)

        viewModel.resultado.observe(viewLifecycleOwner, Observer {
            resultado_composto.text = it
        })



        calcular_composta.setOnClickListener {

            val caixa_a = caixa_compostas_a.text.toString()
            val caixa_b = caixa_compostas_b.text.toString()
            val caixa_c = caixa_compostas_c.text.toString()
            val caixa_d = caixa_compostas_d.text.toString()
            val caixa_e = caixa_compostas_e.text.toString()
            if(caixa_a.isNotEmpty()){
                if (caixa_b.isNotEmpty()){
                    if (caixa_c.isNotEmpty()){
                        if (caixa_d.isNotEmpty()){
                            if (caixa_e.isNotEmpty()){

                                viewModel.calcularComposto(caixa_a, caixa_b, caixa_c, caixa_d, caixa_e).toString()
                            }else{
                                Toast.makeText(context, "Você Precisa Preenche todas as lacunas", Toast.LENGTH_SHORT).show()
                            }
                        }else{
                            Toast.makeText(context, "Você Precisa Preenche todas as lacunas", Toast.LENGTH_SHORT).show()
                        }
                    }else{
                        Toast.makeText(context, "Você Precisa Preenche todas as lacunas", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(context, "Você Precisa Preenche todas as lacunas", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(context, "Você Precisa Preenche todas as lacunas", Toast.LENGTH_SHORT).show()
            }

        }
    }

}