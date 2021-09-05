package me.dgahn.valueclass

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.delay

class DurationTest: FunSpec({

    test("millisec와 sec로 Duration을 구할 수 있다.") {
        println(1)
        delay(1_000L)
        Duration.millis(10_000) shouldBe Duration.seconds(10)
    }

})