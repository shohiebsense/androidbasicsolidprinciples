package com.shohiebsense.solidprinciplessample.liskov.bad.car

import com.shohiebsense.solidprinciplessample.liskov.good.car.Car


class MiniCooper(name: String = "MiniCooper", override var doorsCount: Int =2) : Car(name) {

}