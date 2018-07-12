package io.tangtomorrow.blingmall.usercenter.injection.module

import dagger.Module
import dagger.Provides
import io.tangtomorrow.blingmall.usercenter.service.UserService
import io.tangtomorrow.blingmall.usercenter.service.impl.UserServiceImpl

@Module
class UserModule {

    @Provides
    fun provideUserService(userService: UserServiceImpl): UserService {
        return userService
    }

}
