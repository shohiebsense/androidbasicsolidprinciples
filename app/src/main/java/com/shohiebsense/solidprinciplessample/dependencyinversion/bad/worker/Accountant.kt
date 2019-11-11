package com.shohiebsense.solidprinciplessample.dependencyinversion.bad.worker

class Accountant: Worker() {
    override fun work() {
        println("Accountant is doing calculations now")
    }

}