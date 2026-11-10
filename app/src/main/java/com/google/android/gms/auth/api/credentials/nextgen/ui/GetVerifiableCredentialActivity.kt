package com.google.android.gms.auth.api.credentials.nextgen.ui

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R
import com.google.android.gms.R.layout.activity_permissions

class GetVerifiableCredentialActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}