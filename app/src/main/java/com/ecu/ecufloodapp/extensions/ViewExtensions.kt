package com.ecu.ecufloodapp.extensions

import android.view.View

/** Makes a view visible */
fun View.visible() {
    visibility = View.VISIBLE
}

/** Makes a view invisible */
fun View.invisible() {
    visibility = View.INVISIBLE
}