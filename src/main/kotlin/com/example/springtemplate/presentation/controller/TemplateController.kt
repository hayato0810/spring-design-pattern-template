package com.example.springtemplate.presentation.controller

import com.example.springtemplate.domain.CharDisplay
import com.example.springtemplate.domain.StringDisplay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.system.exitProcess

@RestController
@RequestMapping("/template")
class TemplateController {

    @GetMapping
    fun getTemplate() : String {

        // プロセス1の実行
        val process1 = CharDisplay('H')
        process1.execute()

        // 改行
        println()

        // プロセス2の実行
        val process2 = StringDisplay("Hello")
        process2.execute()

        return "Hello Template"
    }
}