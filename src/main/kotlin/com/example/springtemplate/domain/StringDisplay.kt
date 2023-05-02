package com.example.springtemplate.domain

class StringDisplay(private val string: String) : AbstractProcess() {

    override fun before() {
        println("=== start ===")
    }

    override fun process() {
        println(string)
    }

    override fun after() {
        println("=== end ===")
    }
}