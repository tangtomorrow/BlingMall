package io.tangtomorrow.blingmall.baselibrary.injection.component

import android.content.Context
import dagger.Component
import io.tangtomorrow.blingmall.baselibrary.injection.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context():Context
}