package com.applocum.kotlincoroutineexample

import kotlin.concurrent.thread

fun main()//Executes main thread
{
    println("Main Program starts: ${Thread.currentThread().name}")//prints name of current thread--> Main Thread

    thread {
        //Background Thread or Worker Thread
        println("Dummy work starts: ${Thread.currentThread().name}")//prints name of current thread
        Thread.sleep(1000)//--> file upload dummy thread
        println("Dummy work finished: ${Thread.currentThread().name}")


    }

    println("Main Program ends: ${Thread.currentThread().name}")//--> Main Thread
}


//Here background thread is running parallel to main Thread it didnot block the main thread
//App waits for all background threads to get complete and then terminates the app