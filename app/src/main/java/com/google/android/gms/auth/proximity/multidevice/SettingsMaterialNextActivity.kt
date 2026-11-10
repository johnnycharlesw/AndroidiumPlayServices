package com.google.android.gms.auth.proximity.multidevice

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R
import com.google.android.gms.R.layout.activity_permissions

class SettingsMaterialNextActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}