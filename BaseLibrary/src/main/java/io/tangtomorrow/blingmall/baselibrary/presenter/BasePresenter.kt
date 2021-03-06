package io.tangtomorrow.blingmall.baselibrary.presenter

import com.trello.rxlifecycle.LifecycleProvider
import io.tangtomorrow.blingmall.baselibrary.presenter.view.BaseView
import javax.inject.Inject

open class BasePresenter<T : BaseView> {
    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>
}