package com.shohiebsense.solidprinciplessample.openclosedprinciple.good.car


class Volkswagen(name : String = "Volkswagen", override var doorsCount: Int = 6) : Car(name) {

}