package com.ineedyourcode.pr_testing

import java.util.*

class FunCallbacker {
    fun onTimeRequest(callback: FooCallback.FunCallback){
        val branch13 = ""
        Thread{
            val startTime = Date().time
            Thread.sleep((1000..5000).random().toLong())
            val endTime = Date().time
            when (val time = endTime - startTime) {
                in 1000 .. 2999 -> {callback.faster3000(time)}
                in 3000 .. 5000 -> {callback.slower3000(time)}
            }
        }.start()
    }
}