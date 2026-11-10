package com.google.android.gms.auth.api.credentials.assistedsignin.ui

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R.layout.activity_permissions

// use local accounts instead
class GoogleSignInActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}