package com.example.springtemplate.domain

class CharDisplay(private val ch: Char) : AbstractProcess() {

    override fun before() {
        print("渡された文字は「")
    }

    override fun process() {
        print(ch)
    }

    override fun after() {
        println("」です")
    }
}