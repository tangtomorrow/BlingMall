package io.tangtomorrow.blingmall.baselibrary.ui.activity

import io.tangtomorrow.blingmall.baselibrary.presenter.BasePresenter
import io.tangtomorrow.blingmall.baselibrary.presenter.view.BaseView

abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }

    lateinit var mPresenter: T
}