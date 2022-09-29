package com.junior.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var cont= MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
    }
}