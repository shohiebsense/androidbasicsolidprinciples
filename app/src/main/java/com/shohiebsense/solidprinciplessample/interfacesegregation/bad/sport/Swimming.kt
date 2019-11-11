package com.shohiebsense.solidprinciplessample.interfacesegregation.bad.sport

class Swimming : ISport {
    var isReady = false
    override fun swim() {
        if(isReady){
            println("Swimming")
        } else{
            print("Not Ready")
        }
    }

    override fun run() {}

    override fun longJump() {
    }

    override fun highJump() {
    }

    override fun getReady() {
        isReady = true
        println("Ready to swim")
    }

    override fun stop() {
        println("Stopped Swimming")
    }

}