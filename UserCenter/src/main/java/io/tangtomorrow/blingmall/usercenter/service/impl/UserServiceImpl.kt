package io.tangtomorrow.blingmall.usercenter.service.impl

import io.tangtomorrow.blingmall.baselibrary.data.protocol.BaseResp
import io.tangtomorrow.blingmall.baselibrary.rx.BaseException
import io.tangtomorrow.blingmall.usercenter.data.repository.UserRepository
import io.tangtomorrow.blingmall.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1

class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile, verifyCode, pwd)
                .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
                    override fun call(t: BaseResp<String>): Observable<Boolean> {
                        if (t.status != 0) {
                            return  Observable.error(BaseException(t.status, t.message))
                        }

                        return Observable.just(true)
                    }

                })
    }
}
