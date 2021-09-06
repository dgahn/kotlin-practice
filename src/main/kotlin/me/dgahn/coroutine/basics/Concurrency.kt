package me.dgahn.coroutine.basics

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld()
    println("Done")
}

private suspend fun doWorld() = coroutineScope {
    launch {
        delay(2_000L)
        println("World 2")
    }
    launch {
        delay(1_000L)
        println("World 1")
    }
    println("Hello")
}