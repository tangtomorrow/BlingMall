package io.tangtomorrow.blingmall.usercenter.service.impl

import io.tangtomorrow.blingmall.baselibrary.ext.convertToBoolean
import io.tangtomorrow.blingmall.usercenter.data.repository.UserRepository
import io.tangtomorrow.blingmall.usercenter.service.UserService
import rx.Observable
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return repository.register(mobile, verifyCode, pwd)
                .convertToBoolean()
    }
}
