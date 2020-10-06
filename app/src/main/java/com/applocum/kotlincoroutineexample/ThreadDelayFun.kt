package com.applocum.kotlincoroutineexample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()
{

    println("Start: ${Thread.currentThread().name}")

    GlobalScope.launch {//coroutine 1 doesnot block main thread
        println("Demo:${Thread.currentThread().name}")
        delay(1000)
        println("Demo:${Thread.currentThread().name}")

    }
    //Same as Thread.sleep
    runBlocking {//coroutine 2 blocks the main thread
        delay(1000)
    }
    println("End:${Thread.currentThread().name}")
}