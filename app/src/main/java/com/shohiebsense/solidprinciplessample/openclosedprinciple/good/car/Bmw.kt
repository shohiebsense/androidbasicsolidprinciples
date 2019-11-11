package com.shohiebsense.solidprinciplessample.openclosedprinciple.good.car

class Bmw(name : String = "BMW", override var doorsCount: Int = 4) : Car(name) {

}