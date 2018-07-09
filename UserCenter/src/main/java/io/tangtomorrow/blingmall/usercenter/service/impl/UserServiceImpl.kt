package io.tangtomorrow.blingmall.usercenter.service.impl

import io.tangtomorrow.blingmall.usercenter.service.UserService
import rx.Observable

class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}
