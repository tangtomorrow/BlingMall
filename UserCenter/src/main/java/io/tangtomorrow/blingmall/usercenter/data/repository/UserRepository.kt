package io.tangtomorrow.blingmall.usercenter.data.repository

import io.tangtomorrow.blingmall.baselibrary.data.net.RetrofitFactory
import io.tangtomorrow.blingmall.baselibrary.data.protocol.BaseResp
import io.tangtomorrow.blingmall.usercenter.data.api.UserApi
import io.tangtomorrow.blingmall.usercenter.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

class UserRepository  @Inject constructor(){
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile, pwd, verifyCode))
    }
}