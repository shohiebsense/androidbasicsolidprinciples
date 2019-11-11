package com.shohiebsense.solidprinciplessample.interfacesegregation.good.sport

class Swimming : ISwimming {
    var isReady = false

    override fun swim() {
        if(isReady){
            println("Swimming...")
        }else{
            println("Not Ready ....")
        }
    }

    override fun getReady() {
        isReady = true
        println("Ready to swim")
    }

    override fun stop() {
        println("Stopped Swimming")
    }

}