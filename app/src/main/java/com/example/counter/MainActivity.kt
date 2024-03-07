package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        with(binding){
            btnInc.setOnClickListener {
                viewModel.inc()
            }
            btnDec.setOnClickListener {
                viewModel.dec()
            }
            viewModel.countLv.observe( this@MainActivity){
                tvResult.text = it.toString()
            }
        }
    }
}