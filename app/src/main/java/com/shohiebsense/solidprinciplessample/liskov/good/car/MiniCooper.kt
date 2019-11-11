package com.shohiebsense.solidprinciplessample.liskov.good.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car


class MiniCooper(name: String = "MiniCooper", override var doorsCount: Int =2) : Car(name) {

    override fun engineCapacity(): Int {
        return 2500
    }
}