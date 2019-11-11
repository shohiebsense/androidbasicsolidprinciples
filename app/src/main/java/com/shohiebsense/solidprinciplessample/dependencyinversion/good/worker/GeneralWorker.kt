package com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker

class GeneralWorker: IWorker {
    override fun work() {
        println("General worker is now working")
    }

}