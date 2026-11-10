package com.google.android.gms.home

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R.layout.activity_settings

class HublessActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_settings)
    }
}