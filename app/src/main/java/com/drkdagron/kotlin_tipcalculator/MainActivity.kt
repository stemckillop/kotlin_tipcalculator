package com.drkdagron.kotlin_tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateTip(view: View) {
        var total = edt_cost.editableText.toString().toFloat()
        var tip = edt_tip.editableText.toString().toFloat() / 100

        Log.e("TIP", tip.toString())
        Log.e("TIP", total.toString())

        txt_total.text = "$" + (total + (total * tip)).toString()
    }
}
