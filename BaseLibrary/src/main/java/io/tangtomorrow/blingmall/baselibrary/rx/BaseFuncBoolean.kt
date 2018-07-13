package io.tangtomorrow.blingmall.baselibrary.rx

import io.tangtomorrow.blingmall.baselibrary.data.protocol.BaseResp
import rx.Observable
import rx.functions.Func1

class BaseFuncBoolean<T> : Func1<BaseResp<T>, Observable<Boolean>> {
    override fun call(t: BaseResp<T>): Observable<Boolean> {
        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))
        }

        return Observable.just(true)
    }
}
