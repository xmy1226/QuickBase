package com.androidwind.androidquick.module.glide.support

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
interface ImageListener<T> {

    fun onSuccess(result: T)

    fun onFail(throwable: Throwable)
}
