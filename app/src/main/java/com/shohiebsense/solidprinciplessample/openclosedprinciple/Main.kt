package com.shohiebsense.solidprinciplessample.openclosedprinciple

import com.shohiebsense.solidprinciplessample.openclosedprinciple.good.car.*

class Main {

    fun run(){
        var cars = arrayListOf(Bmw(), MiniCooper(), Volkswagen(), Fiat())
        cars.forEach {
            println("${it.name} has - ${it.doorsCount} doors }")
        }
    }

}