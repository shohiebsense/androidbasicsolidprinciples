package com.shohiebsense.solidprinciplessample.dependencyinversion

import com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker.Accountant
import com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker.GeneralWorker
import com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker.Manager

class Main {

    fun run(){
        val manager = Manager()
        manager.addWorker(GeneralWorker())
        manager.addWorker(Accountant())
        manager.manageWorkers()
    }
}