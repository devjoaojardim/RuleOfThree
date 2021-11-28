package com.jvjp.regradetrs.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.jvjp.regradetrs.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }


    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?

    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.resultado.observe(viewLifecycleOwner, Observer {
            resultado_simples.text = it
        })



        calcular_simples.setOnClickListener {

             val caixa_a = caixa_simples_a.text.toString()
             val caixa_b = caixa_simples_b.text.toString()
             val caixa_c = caixa_simples_c.text.toString()
            if (caixa_a.isNotEmpty()){
                if (caixa_b.isNotEmpty()){
                    if (caixa_c.isNotEmpty()){
                        viewModel.calcular(caixa_a, caixa_b, caixa_c).toString()
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