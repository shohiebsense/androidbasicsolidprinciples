package com.shohiebsense.solidprinciplessample.liskov

import com.shohiebsense.solidprinciplessample.liskov.good.car.*

class Main {

    fun run(){
        var cars = arrayListOf<Car>(Bmw(), MiniCooper(), Volkswagen(), Fiat())
        cars.forEach {
            println("${it.name}  - has ${it.engineCapacity()} CC Engine capacity")
        }
    }
}