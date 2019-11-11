package com.shohiebsense.solidprinciplessample.interfacesegregation.good.sport

class Running : IRunning {
    var isReady = false

    override fun run() {
        if(isReady){
            println("Running...")
        }else{
            println("Not Ready Yet")
        }
    }

    override fun getReady() {
        isReady = true
        println("Ready to rpun")
    }

    override fun stop() {
        println("Stopped Running")
    }
}