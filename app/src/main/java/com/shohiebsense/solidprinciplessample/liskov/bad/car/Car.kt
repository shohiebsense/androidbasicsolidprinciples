package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.bad.car.Bmw
import com.shohiebsense.solidprinciplessample.liskov.bad.car.Car
import com.shohiebsense.solidprinciplessample.liskov.bad.car.Fiat
import com.shohiebsense.solidprinciplessample.liskov.bad.car.MiniCooper

abstract class Car(val name : String) {
    abstract var doorsCount : Int

    fun printEngineCapacity(vararg cars : Car) : Int{
        cars.forEach {
            if(it is Bmw){
                return 3400
            }
            if(it is Volkswagen){
                return 2600
            }
            if(it is MiniCooper){
                return 3000
            }
            if(it is Fiat){
                return 1600
            }
        }
        return 0
    }

}