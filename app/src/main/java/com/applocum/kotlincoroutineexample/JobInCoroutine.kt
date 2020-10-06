package com.applocum.kotlincoroutineexample

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
println("Start${Thread.currentThread().name}")

    val job:Job=launch {
        println("Demo${Thread.currentThread().name}")
        delay(1000)
        println("Demo${Thread.currentThread().name}")

    }
//cancel the coroutine
    //join function will wait for coroutine to finish task
    job.join()

    println("End${Thread.currentThread().name}")

}
