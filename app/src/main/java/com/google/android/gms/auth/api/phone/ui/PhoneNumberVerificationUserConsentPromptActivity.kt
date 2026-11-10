package com.google.android.gms.auth.api.phone.ui

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R.layout.activity_permissions

class PhoneNumberVerificationUserConsentPromptActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}