package io.tangtomorrow.blingmall.baselibrary.common

import android.app.Application
import io.tangtomorrow.blingmall.baselibrary.injection.component.AppComponent
import io.tangtomorrow.blingmall.baselibrary.injection.component.DaggerAppComponent
import io.tangtomorrow.blingmall.baselibrary.injection.module.AppModule

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}