package com.example.eyeshadow.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eyeshadow.network.MakeUpApi
import com.example.eyeshadow.network.Eyeshadow
import kotlinx.coroutines.launch

class MakeUpViewModel: ViewModel() {



    private val _listeyeshadow = MutableLiveData<List<Eyeshadow>>()
    val listeyeshadow: LiveData<List<Eyeshadow>> = _listeyeshadow

    private val _eyeshadow = MutableLiveData<Eyeshadow>()
    val Eyeshadow: LiveData<Eyeshadow> = _eyeshadow



    fun getDataEyeshadow(){
        viewModelScope.launch {
            try {
                _listeyeshadow.value = MakeUpApi.retrofitServiceApi.getDataEyeshadow("https://makeup-api.herokuapp.com/api/v1/products.json?product_type=eyeshadow")
                Log.d("berhasil", _listeyeshadow.value.toString())
            } catch (e: Exception){
                Log.d("error", e.stackTraceToString())
            }
        }
    }

    fun onEyeshadowClicked(Eyeshadow: Eyeshadow){
        _eyeshadow.value = Eyeshadow
    }
}