package com.google.android.gms.auth.authzen

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R.layout.activity_permissions

class AuthzenDeeplinkHandlerActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}