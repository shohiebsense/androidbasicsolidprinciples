package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.bad.car.Car

class Fiat(name: String = "Fiat", override var doorsCount: Int = 3) : Car(name) {

}