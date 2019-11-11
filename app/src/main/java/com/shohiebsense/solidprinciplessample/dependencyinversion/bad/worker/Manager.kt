package com.shohiebsense.solidprinciplessample.dependencyinversion.bad.worker

class Manager {
    var workers = arrayListOf<Worker>()
    fun addWorker(worker: Worker){
        workers.add(worker)
    }

    fun manageWorker(){
        workers.forEach {
            it.work()
        }
    }


}