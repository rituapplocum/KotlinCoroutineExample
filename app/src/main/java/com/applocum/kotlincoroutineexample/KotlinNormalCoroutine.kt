package com.applocum.kotlincoroutineexample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main()//Executes main thread
{
    println("Main Program starts: ${Thread.currentThread().name}")//prints name of current thread--> Main Thread

GlobalScope.launch{
        //Creates a Background coroutine that runs on a background thread
        println("Dummy work starts: ${Thread.currentThread().name}")//prints name of current thread
        Thread.sleep(1000)//--> file upload dummy thread
        println("Dummy work finished: ${Thread.currentThread().name}")


    }
//Blocks main thread manually add sleep to wait app to execute coroutine
    Thread.sleep(2000)
    println("Main Program ends: ${Thread.currentThread().name}")//--> Main Thread
}
//When coroutine is launched application doesn't know whether to wait for coroutine

//Corountine is attached to a thread

//Thread.sleep(1000) vs delay(1000)

/*thread{

    Thread.sleep(1000) //blocks the thread for 1 second
}*/

/*

GlobalScope.launch{

    delay(1000)  //suspends the corountine for 1 second not the thread so other coroutine may work
}*/
