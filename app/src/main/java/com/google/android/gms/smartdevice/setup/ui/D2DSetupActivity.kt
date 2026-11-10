package com.google.android.gms.smartdevice.setup.ui

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R
import com.google.android.gms.R.layout.activity_permissions

class D2DSetupActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}