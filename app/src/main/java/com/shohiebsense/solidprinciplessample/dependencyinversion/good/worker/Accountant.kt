package com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker

class Accountant: IWorker {
    override fun work() {
        println("Accountant is doing the calculations now")
    }
}