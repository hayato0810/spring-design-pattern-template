package com.example.springtemplate.domain

abstract class AbstractProcess {

    // 前処理
    protected abstract fun before()

    // メイン処理
    protected abstract fun process()

    // 後処理
    protected abstract fun after()

    // テンプレートメソッド
    fun execute() {
        before()
        process()
        after()
    }
}