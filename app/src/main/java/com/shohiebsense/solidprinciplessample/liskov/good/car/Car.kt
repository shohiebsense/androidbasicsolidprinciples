package com.shohiebsense.solidprinciplessample.liskov.good.car


abstract class Car(val name : String) {
    abstract var doorsCount : Int
    abstract fun engineCapacity() : Int

    fun printEngineCapacity(vararg car : Car){
        car.forEach {
            println("${it.name} with engine ${it.engineCapacity()}")
        }
    }
}