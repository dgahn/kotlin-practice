package me.dgahn.coroutine.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1_000L)
        println("World!")
    }
    println("Hello")
    job.join()
    println("Done")
}