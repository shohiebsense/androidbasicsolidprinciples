package com.shohiebsense.solidprinciplessample.liskov.good.car

class Volkswagen(name : String = "Volkswagen", override var doorsCount: Int = 6) : Car(name) {

}