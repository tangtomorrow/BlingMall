package io.tangtomorrow.blingmall.usercenter.presenter

import io.tangtomorrow.blingmall.baselibrary.ext.execute
import io.tangtomorrow.blingmall.baselibrary.presenter.BasePresenter
import io.tangtomorrow.blingmall.baselibrary.rx.BaseSubscriber
import io.tangtomorrow.blingmall.usercenter.presenter.view.RegisterView
import io.tangtomorrow.blingmall.usercenter.service.UserService
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    fun register(mobile: String, verifyCode: String, pwd: String) {
        /*
            业务逻辑
         */
        userService.register(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        if (t) {
                            mView.onRegisterResult("注册成功")
                        }
                    }
                }, lifecycleProvider)
    }

    /*
    fun login(mobile: String, pwd: String) {
        /*
            业务逻辑
         */
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
    */
}
