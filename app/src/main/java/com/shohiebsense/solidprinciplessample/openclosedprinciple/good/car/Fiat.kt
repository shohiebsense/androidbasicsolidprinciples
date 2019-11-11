package com.shohiebsense.solidprinciplessample.openclosedprinciple.good.car

class Fiat(name: String = "Fiat", override var doorsCount: Int = 3) : Car(name) {

}