package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.bad.car.Car

class Bmw(name : String = "BMW", override var doorsCount: Int = 4) : Car(name) {


}