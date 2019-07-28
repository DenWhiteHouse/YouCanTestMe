package com.example.youcantestme.data

interface TestRepoInterface {
    fun getNumStringList() : List<String>
}

class TestRepository : TestRepoInterface {
    companion object {
        val numListString = listOf("one","two","three","four","five")
    }
    override fun getNumStringList() : List<String>{
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