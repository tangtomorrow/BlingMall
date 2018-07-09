package io.tangtomorrow.blingmall.usercenter.presenter

import io.tangtomorrow.blingmall.baselibrary.ext.execute
import io.tangtomorrow.blingmall.baselibrary.presenter.BasePresenter
import io.tangtomorrow.blingmall.baselibrary.rx.BaseSubscriber
import io.tangtomorrow.blingmall.usercenter.presenter.view.RegisterView
import io.tangtomorrow.blingmall.usercenter.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String, pwd: String) {
        /*
            业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(true)
                    }
                })
    }

    fun login(mobile: String, pwd: String) {
        /*
            业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile, "", pwd)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : Subscriber<Boolean>() {
                    override fun onNext(t: Boolean?) {
                        mView.onRegisterResult(true)
                    }

                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable?) {

                    }
                })
    }
}
