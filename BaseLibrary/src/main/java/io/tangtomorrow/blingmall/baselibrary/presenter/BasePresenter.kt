package io.tangtomorrow.blingmall.baselibrary.presenter

import io.tangtomorrow.blingmall.baselibrary.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}