package io.tangtomorrow.blingmall.usercenter.data.api

import io.tangtomorrow.blingmall.baselibrary.data.protocol.BaseResp
import io.tangtomorrow.blingmall.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResp<String>>
}