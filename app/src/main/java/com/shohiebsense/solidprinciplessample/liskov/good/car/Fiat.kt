package com.shohiebsense.solidprinciplessample.liskov.good.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car

class Fiat(name: String = "Fiat", override var doorsCount: Int = 3) : Car(name) {
    override fun engineCapacity(): Int {
        return 3000
    }
}