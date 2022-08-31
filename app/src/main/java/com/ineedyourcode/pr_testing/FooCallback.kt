package com.ineedyourcode.pr_testing

interface FooCallback {

    interface FunCallback {
        fun faster3000(time: Long)
        fun slower3000(time: Long)
    }

    interface UnitCallback {
        fun logTime(callback: (Long) -> Unit)
    }
}