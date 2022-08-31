package com.ineedyourcode.pr_testing

import java.util.*

class UnitCallbacker : FooCallback.UnitCallback {
    override fun logTime(callback : (Long) -> Unit) {
        val branch12 = "12"
        Thread {
            val timeBefore = Date().time
            Thread.sleep((2000..4000).random().toLong())
            val timeAfter = Date().time
            callback.invoke(timeAfter - timeBefore)
        }.start()
    }
}