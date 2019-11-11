package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.bad.car.Car

class Volkswagen (name: String = "Volkswagen", override var doorsCount: Int =2) : Car(name) {

}