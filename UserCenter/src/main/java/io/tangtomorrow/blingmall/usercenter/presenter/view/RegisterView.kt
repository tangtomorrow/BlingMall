package io.tangtomorrow.blingmall.usercenter.presenter.view

import io.tangtomorrow.blingmall.baselibrary.presenter.view.BaseView

interface RegisterView : BaseView {
    fun onRegisterResult(result: String)
}