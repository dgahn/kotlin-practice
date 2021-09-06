package me.dgahn.coroutine.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch { doWorld() }
    println("Hello")
}

private suspend fun doWorld() {
    delay(1_000L)
    println("World!")
}