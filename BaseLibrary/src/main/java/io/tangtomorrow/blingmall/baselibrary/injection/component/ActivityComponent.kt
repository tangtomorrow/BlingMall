package io.tangtomorrow.blingmall.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import io.tangtomorrow.blingmall.baselibrary.injection.ActivityScope
import io.tangtomorrow.blingmall.baselibrary.injection.module.ActivityModule
import io.tangtomorrow.blingmall.baselibrary.injection.module.LifecycleProviderModule

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, LifecycleProviderModule::class))
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}