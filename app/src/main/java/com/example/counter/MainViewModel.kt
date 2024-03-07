package com.example.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _countLv = MutableLiveData<Int>().apply { value = 0 }
    val countLv: LiveData<Int> get() = _countLv

    fun inc() {
        _countLv.value = _countLv.value?.plus(1)
    }

    fun dec() {
        _countLv.value = _countLv.value?.minus(1)
    }
}