package io.tangtomorrow.blingmall.usercenter.presenter

import io.tangtomorrow.blingmall.baselibrary.presenter.BasePresenter
import io.tangtomorrow.blingmall.usercenter.presenter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String) {
        /*
            业务逻辑
         */

        mView.onRegisterResult(true)
    }
}
