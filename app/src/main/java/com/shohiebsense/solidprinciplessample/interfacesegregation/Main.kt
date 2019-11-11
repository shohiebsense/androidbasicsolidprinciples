package com.shohiebsense.solidprinciplessample.interfacesegregation

import com.shohiebsense.solidprinciplessample.interfacesegregation.good.sport.Running
import com.shohiebsense.solidprinciplessample.interfacesegregation.good.sport.Swimming

class Main {

    fun run(){
        val swimmer = Swimming()
        swimmer.getReady()
        swimmer.swim()

        val runner = Running()
        runner.getReady()
        runner.run()
    }
}