package me.dgahn.coroutine.cancellation

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        repeat(1_000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1_300L)
    println("main: I'm tried of waiting!")
    job.cancel()
    job.join()
    println("main: Now I can quit.")
}