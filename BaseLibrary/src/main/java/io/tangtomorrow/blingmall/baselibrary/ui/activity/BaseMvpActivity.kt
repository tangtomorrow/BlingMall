package io.tangtomorrow.blingmall.baselibrary.ui.activity

import android.os.Bundle
import io.tangtomorrow.blingmall.baselibrary.common.BaseApplication
import io.tangtomorrow.blingmall.baselibrary.injection.component.ActivityComponent
import io.tangtomorrow.blingmall.baselibrary.injection.component.DaggerActivityComponent
import io.tangtomorrow.blingmall.baselibrary.injection.module.ActivityModule
import io.tangtomorrow.blingmall.baselibrary.presenter.BasePresenter
import io.tangtomorrow.blingmall.baselibrary.presenter.view.BaseView
import javax.inject.Inject

abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }

    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initActivityInjection()
    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent).activityModule(ActivityModule(this)).build()
    }
}