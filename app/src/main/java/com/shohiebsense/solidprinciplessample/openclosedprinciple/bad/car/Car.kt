package com.shohiebsense.solidprinciplessample.openclosedprinciple.bad.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car

class Car(val name: String) {

    fun printCarDoorCount(vararg  cars: Car) : Int{
        cars.forEach {
            if(it.name == "BMW"){
                return 4
            }
            if(it.name == "VW"){
                return 4
            }
            if(it.name == "MINI"){
                return 2
            }
        }
        return 0
    }
}