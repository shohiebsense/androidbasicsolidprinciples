package com.shohiebsense.solidprinciplessample.openclosedprinciple.good.car

class Bmw(name : String = "BMW", override var doorsCount: Int) : Car(name) {
    val carsCount = 4
}