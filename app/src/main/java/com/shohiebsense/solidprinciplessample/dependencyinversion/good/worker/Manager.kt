package com.shohiebsense.solidprinciplessample.dependencyinversion.good.worker


class Manager: IManager {
    var workers = arrayListOf<IWorker>()

    override fun addWorker(worker: IWorker) {
        workers.add(worker)
    }

    override fun manageWorkers() {
        workers.forEach {
            it.work()
        }
    }
}