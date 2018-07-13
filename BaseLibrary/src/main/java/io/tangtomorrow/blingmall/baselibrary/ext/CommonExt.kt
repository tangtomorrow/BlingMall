package io.tangtomorrow.blingmall.baselibrary.ext

import android.view.View
import com.trello.rxlifecycle.LifecycleProvider
import io.tangtomorrow.blingmall.baselibrary.data.protocol.BaseResp
import io.tangtomorrow.blingmall.baselibrary.rx.BaseFunc
import io.tangtomorrow.blingmall.baselibrary.rx.BaseFuncBoolean
import io.tangtomorrow.blingmall.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>, lifecycleProvider: LifecycleProvider<*>) {
    this.observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}

fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunc())
}

fun <T> Observable<BaseResp<T>>.convertToBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}

fun View.onClick(listener: View.OnClickListener) {
    this.setOnClickListener(listener)
}

fun View.onClick(method: () -> Unit) {
    this.setOnClickListener { method() }
}
