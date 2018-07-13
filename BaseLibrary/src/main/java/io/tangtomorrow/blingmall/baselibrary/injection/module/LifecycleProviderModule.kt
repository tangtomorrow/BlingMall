package io.tangtomorrow.blingmall.baselibrary.injection.module

import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides

@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun providesLifecycleModule(): LifecycleProvider<*> {
        return lifecycleProvider
    }
}
