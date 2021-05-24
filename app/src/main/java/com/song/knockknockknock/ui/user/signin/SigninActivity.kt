package com.song.knockknockknock.ui.user.signin

import androidx.activity.viewModels
import com.song.knockknockknock.R
import com.song.knockknockknock.base.BaseActivity
import com.song.knockknockknock.databinding.ActivitySigninBinding

class SigninActivity : BaseActivity<ActivitySigninBinding>(R.layout.activity_signin) {

    private val viewModel: SigninViewModel by viewModels()

    override fun initObserver() {
    }
}