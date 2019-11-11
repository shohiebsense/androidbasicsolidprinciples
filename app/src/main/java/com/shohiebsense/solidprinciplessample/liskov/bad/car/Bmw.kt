package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car

class Bmw(name : String = "BMW", override var doorsCount: Int) : Car(name) {
    val carsCount = 4
}