package com.example.youcantestme.data

class TestRepository {
    companion object {
        val numListString = listOf("one","two","three","four","five")
    }
    fun getNumStringList() : List<String>{
        return numListString
    }

    fun randomNumbersList(size : Int) : List<Int>{
        var numberList = mutableListOf<Int>()
        for(i in 0..size){
            numberList.add((1..100).random())
        }
        return numberList
    }
}