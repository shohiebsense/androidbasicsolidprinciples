package com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker

class Main {

    fun run(){
        val manager = Manager()
        manager.addWorker(GeneralWorker())
        manager.addWorker(Accountant())
        manager.manageWorkers()
    }
}