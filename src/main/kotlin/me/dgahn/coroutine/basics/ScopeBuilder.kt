package me.dgahn.coroutine.basics

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld()
}

private suspend fun doWorld() = coroutineScope {
    launch {
        delay(1_000L)
        println("Hello")
    }
    println("World!")
}