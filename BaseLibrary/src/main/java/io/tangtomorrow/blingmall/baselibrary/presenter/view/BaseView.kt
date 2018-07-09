package io.tangtomorrow.blingmall.baselibrary.presenter.view

interface BaseView {
    fun showLoading()

    fun hideLoading()

    fun onError()
}