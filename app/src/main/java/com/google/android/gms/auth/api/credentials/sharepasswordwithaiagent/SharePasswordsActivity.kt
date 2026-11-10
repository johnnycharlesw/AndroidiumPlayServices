package com.google.android.gms.auth.api.credentials.sharepasswordwithaiagent

import android.app.Activity
import android.os.Bundle
import com.google.android.gms.R
import com.google.android.gms.R.layout.activity_permissions

/**
 * this is for vibecloning protection probably, get out of here rea
 */
class SharePasswordsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_permissions)
    }
}