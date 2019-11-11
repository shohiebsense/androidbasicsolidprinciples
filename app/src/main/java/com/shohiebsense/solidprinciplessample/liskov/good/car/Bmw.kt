package com.shohiebsense.solidprinciplessample.liskov.good.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car

class Bmw(name : String = "BMW", override var doorsCount: Int) : Car(name) {

    val carsCount = 4
    override fun engineCapacity(): Int {
        return 3400
    }

}