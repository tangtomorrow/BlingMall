package io.tangtomorrow.blingmall.baselibrary.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import io.tangtomorrow.blingmall.baselibrary.common.BaseApplication
import javax.inject.Singleton

@Module
class AppModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}
