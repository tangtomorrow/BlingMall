package io.tangtomorrow.blingmall.baselibrary.injection.component

import android.app.Activity
import dagger.Component
import io.tangtomorrow.blingmall.baselibrary.injection.ActivityScope
import io.tangtomorrow.blingmall.baselibrary.injection.module.ActivityModule

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
}