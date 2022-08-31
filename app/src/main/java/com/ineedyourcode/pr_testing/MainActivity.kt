package com.ineedyourcode.pr_testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val funCaller = FunCallbacker()
    private val unitCaller = UnitCallbacker()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            doDirt()
            val s = R.string.app_name
        }

        //ветка - 11.3
        //SECOND PR 2
        //111111111111111111111111111111111111111111111111111111111fffffffff
    }

    private fun doDirt() {
        var slower3000 = 0
        var faster3000 = 0
        for (i in 1..10) {
            funCaller.onTimeRequest (object : FooCallback.FunCallback {
                override fun faster3000(time: Long) {
                    faster3000++
                    Log.d("Callbacker", "${funCaller.javaClass.canonicalName} -> $faster3000")
                }

                override fun slower3000(time: Long) {
                    slower3000++
                    Log.d("Callbacker", "${funCaller.javaClass.canonicalName} -> $slower3000")
                }
            })

            unitCaller.logTime {
                Log.d("Callbacker", "${unitCaller.javaClass.canonicalName} -> $it ms")
            }
        }
    }
}

interface AA {
    abstract class A : AA {
        fun funA() {}
    }
}


interface BB {
    abstract class B : BB {
        fun funB() {}
    }
}

class C : AA,  BB{

fun funG() {

}
}