package io.tangtomorrow.blingmall.usercenter.ui.activity

import android.os.Bundle
import io.tangtomorrow.blingmall.baselibrary.ext.onClick
import io.tangtomorrow.blingmall.baselibrary.ui.activity.BaseMvpActivity
import io.tangtomorrow.blingmall.usercenter.R
import io.tangtomorrow.blingmall.usercenter.injection.component.DaggerUserComponent
import io.tangtomorrow.blingmall.usercenter.injection.module.UserModule
import io.tangtomorrow.blingmall.usercenter.presenter.RegisterPresenter
import io.tangtomorrow.blingmall.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityComponent).userModule(UserModule()).build().inject(this)
        mPresenter.mView = this
    }

    override fun onRegisterResult(result: String) {
        toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register.onClick {
            mPresenter.register(mMobileEt.text.toString(), mVerifyCodeEt.text.toString(), mPwdEt.text.toString())
        }
    }
}
