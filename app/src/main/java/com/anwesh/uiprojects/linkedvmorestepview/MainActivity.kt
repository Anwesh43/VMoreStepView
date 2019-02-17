package com.anwesh.uiprojects.linkedvmorestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.vmorestepview.VMoreStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : VMoreStepView = VMoreStepView.create(this)
    }
}
