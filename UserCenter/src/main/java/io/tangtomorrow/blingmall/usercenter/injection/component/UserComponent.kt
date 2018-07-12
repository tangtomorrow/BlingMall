package io.tangtomorrow.blingmall.usercenter.injection.component

import dagger.Component
import io.tangtomorrow.blingmall.baselibrary.injection.PreComponentScope
import io.tangtomorrow.blingmall.baselibrary.injection.component.ActivityComponent
import io.tangtomorrow.blingmall.usercenter.injection.module.UserModule
import io.tangtomorrow.blingmall.usercenter.ui.activity.RegisterActivity

@PreComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}
