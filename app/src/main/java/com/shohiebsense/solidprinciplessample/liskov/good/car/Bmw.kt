package com.shohiebsense.solidprinciplessample.liskov.good.car


class Bmw(name : String = "BMW", override var doorsCount: Int = 4) : Car(name) {

    override fun engineCapacity(): Int {
        return 3400
    }

}