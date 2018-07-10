package io.tangtomorrow.blingmall.usercenter.ui.activity

import android.os.Bundle
import io.tangtomorrow.blingmall.baselibrary.ui.activity.BaseMvpActivity
import io.tangtomorrow.blingmall.usercenter.R
import io.tangtomorrow.blingmall.usercenter.presenter.RegisterPresenter
import io.tangtomorrow.blingmall.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        btn_register.setOnClickListener {
            mPresenter.register(mMobileEt.text.toString(), mVerifyCodeEt.text.toString(), mPwdEt.text.toString())
        }
    }
}
