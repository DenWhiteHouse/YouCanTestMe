package com.example.youcantestme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.youcantestme.data.TestRepository

class TestViewModel: ViewModel(){
    //TODO decouple dependency
    val testRepository = TestRepository()
    var stringList = testRepository.getNumStringList()

    // Get Button LiveData
    private val _onGetButtonPressedStatus = MutableLiveData<Boolean>()
    val onGetButtonPressedStatus : LiveData<Boolean>
        get() = _onGetButtonPressedStatus

    init {
        _onGetButtonPressedStatus.value = false
    }

    fun onGetButtonPressed(){
        _onGetButtonPressedStatus.value = true
    }

    fun setGetButtonFalse(){
        _onGetButtonPressedStatus.value = false
    }




    override fun onCleared() {
        super.onCleared()
    }
}